package fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.qf.deliiousfoot.R;

import java.util.ArrayList;

import base.BaseFragment;
import butterknife.Bind;
import util.Contants;
import util.FrescoUtil;

/**
 * 头部第一个viewPager
 */
public class Vp_RecommendFragment extends BaseFragment {

    private ArrayList<String> datas = new ArrayList<>();

    /**
     * 三张图片
     */
    @Bind(R.id.sdv_tj_vp_1)
    public SimpleDraweeView sdv_tj_vp_1;
    @Bind(R.id.sdv_tj_vp_2)
    public SimpleDraweeView sdv_tj_vp_2;
    @Bind(R.id.sdv_tj_vp_3)
    public SimpleDraweeView sdv_tj_vp_3;

    /**
     * 8个文本
     */
    @Bind(R.id.tv_tj_vp_1)
    public TextView tv_tj_vp_1;
    @Bind(R.id.tv_tj_vp_2)
    public TextView tv_tj_vp_2;
    @Bind(R.id.tv_tj_vp_3)
    public TextView tv_tj_vp_3;
    @Bind(R.id.tv_tj_vp_4)
    public TextView tv_tj_vp_4;
    @Bind(R.id.tv_tj_vp_5)
    public TextView tv_tj_vp_5;
    @Bind(R.id.tv_tj_vp_6)
    public TextView tv_tj_vp_6;

    @Bind(R.id.tv_tj_vp_7)
    public TextView tv_tj_vp_7;
    @Bind(R.id.tv_tj_vp_8)
    public TextView tv_tj_vp_8;

    @Override
    protected int contentView() {
        return R.layout.fragment_vp_recommend;
    }

    public static Fragment getInstance(ArrayList<String> datas) {
        Vp_RecommendFragment fragment = new Vp_RecommendFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(Contants.KEY.RECOMMEND_VP_DATA,datas);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Bundle bundle = getArguments();
        datas = bundle.getStringArrayList(Contants.KEY.RECOMMEND_VP_DATA);
    }

    @Override
    protected void initView(View view) {
        //第一张图片
        FrescoUtil.bindImageViewRetry(datas.get(0),sdv_tj_vp_1);
        tv_tj_vp_1.setText(datas.get(1));
        tv_tj_vp_2.setText(datas.get(2));

        //第二张图片
        FrescoUtil.bindImageViewRetry(datas.get(3),sdv_tj_vp_2);
        tv_tj_vp_3.setText(datas.get(4));
        tv_tj_vp_4.setText(datas.get(5));

        //第三张图片
        FrescoUtil.bindImageViewRetry(datas.get(6),sdv_tj_vp_3);
        tv_tj_vp_5.setText(datas.get(7));
        tv_tj_vp_6.setText(datas.get(8));

        //标题
        tv_tj_vp_7.setText(datas.get(9));
        tv_tj_vp_8.setText(datas.get(10));
    }
}
