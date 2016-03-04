package util;

import android.os.Handler;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by admin on 2016/2/25.
 */
public class OkhttpUtil {
    private static OkHttpClient okHttpClient;
    private static Handler handler = new Handler();

    /**
     * 初始化OkHttpClient
     */
    public static void initOkHttp(){
        okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10,TimeUnit.SECONDS)
                .writeTimeout(10,TimeUnit.SECONDS)
                .build();
    }
    /**
     * get请求的静态工厂
     */
    public static Request getInstance(String url){
        Request request = new Request.Builder()
                .url(url)
                .build();
        return request;
    }

    /**
     *  post请求的静态工厂
     */
    public static Request getInstance(String url, FormBody body){
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        return request;
    }

    /**
     * 异步get请求下载JSON字符串
     */
    public static void downJSON(final String url, final OnDownDataCompletedListener listener){

        Request request = getInstance(url);

        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                if (listener != null){
                    listener.onFailure(url,e.getMessage());
                }
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String json = response.body().string();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (listener != null){
                            listener.onResponse(url,json);
                        }
                    }
                });
            }
        });
    }

    /**
     * 同步get请求下载JSON字符串
     */
    public static Response downResponse(String url){
        Request request = getInstance(url);

        Call call = okHttpClient.newCall(request);

        try {
            return call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 上传表单,服务器返回的是字符串
     * @param url
     * @param params
     * @param listener
     */
    public static void postSubmitForm(final String url, Map<String, String> params, final OnDownDataCompletedListener listener) {
        if (params.size() > 0) {
            FormBody.Builder builder = new FormBody.Builder();
            for (String key : params.keySet()) {
                String values = params.get(key);
                builder.add(key, values);
            }
            FormBody formBody = builder.build();

            Request request = getInstance(url, formBody);

            Call call = okHttpClient.newCall(request);
            call.enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    listener.onFailure(url, e.getMessage());
                }

                /**
                 *  该回调方法仍然在子线程中执行
                 * @param call
                 * @param response
                 * @throws IOException
                 */
                @Override
                public void onResponse(Call call, final Response response) throws IOException {
                    final String str = response.body().string();
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            if (listener != null) {
                                listener.onResponse(url, str);
                            }
                        }
                    });
                }
            });

        }
    }


    /**
     * 下载完成监听接口
     */
    public interface OnDownDataCompletedListener{
        void onResponse(String url,String json);
        void onFailure(String url,String errorMsg);
    }
}
