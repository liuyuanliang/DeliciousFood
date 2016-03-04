package fragment;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.qf.deliiousfoot.R;

import java.util.ArrayList;
import java.util.List;

import adapter.MyRecommend_lv_Adapter;
import base.BaseFragment;
import butterknife.Bind;
import custem.RecommendHotView;
import custem.RecommendSortView;
import custem.RecommendTodayView;
import custem.RecommendViewPager;
import model.MyYLEntity;
import model.RecommendEntity;
import model.YouLoveEntity;
import util.Contants;
import util.L;
import util.OkhttpUtil;

/**
 * Created by admin on 2016/2/26.
 */
public class RecommendFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener, OkhttpUtil.OnDownDataCompletedListener, AbsListView.OnScrollListener, View.OnTouchListener {

    private static final String TAG = "print";
    @Bind(R.id.lv_recommend)
    public ListView listView;
    @Bind(R.id.srl_recommend)
    public SwipeRefreshLayout swipeRefreshLayout;//官方下拉刷新布局

    private RecommendViewPager viewPager;//头部Viewpager
    private RecommendSortView sortView;//头部分类
    private RecommendHotView hotView;//头部热卖商品
    private RecommendTodayView todayView;
    private int page = 2;//仅有两页
    private String lv_url;
    private MyRecommend_lv_Adapter adapter;//推荐页的listView的适配器
    private TextView tv_youlove;
    private LinearLayout ll_foot;

    private List<MyYLEntity> lv_datas = new ArrayList<>();
    private ImageView iv_top;
    private ImageView iv_animotion;
    private FrameLayout fl_load;

    @Override
    protected int contentView() {
        return R.layout.fragment_recommend;
    }

    @Override
    protected void initView(View view) {

        fl_load = (FrameLayout) view.findViewById(R.id.fl_load);
        iv_animotion = (ImageView) view.findViewById(R.id.iv_animotion);
        AnimationDrawable animation = (AnimationDrawable) iv_animotion.getBackground();
        animation.start();

        ll_foot = (LinearLayout) view.findViewById(R.id.ll_foot);
        ll_foot.setVisibility(View.GONE);

        swipeRefreshLayout.setOnRefreshListener(this);

        /**
         * 头部Viewpager
         */
        viewPager = new RecommendViewPager(getActivity(),getActivity().getSupportFragmentManager());

        /**
         * 头部分类
         */
        sortView = new RecommendSortView(getActivity());

        /**
         * 头部热卖商品
         */
        hotView = new RecommendHotView(getActivity(),getActivity().getSupportFragmentManager());

        /**
         * 头部今日推荐
         */
        todayView = new RecommendTodayView(getActivity());

        /**
         * 猜你喜欢
         */
        View yl_view = LayoutInflater.from(getContext()).inflate(R.layout.youlove_layout,null);
        tv_youlove = (TextView) yl_view.findViewById(R.id.tv_youlove);

        listView.addHeaderView(viewPager);
        listView.addHeaderView(sortView);
        listView.addHeaderView(hotView);
        listView.addHeaderView(todayView);
        listView.addHeaderView(yl_view);


        adapter = new MyRecommend_lv_Adapter(getActivity());

        listView.setAdapter(adapter);
        listView.setOnScrollListener(this);
        listView.setOnTouchListener(this);

        iv_top = (ImageView) view.findViewById(R.id.iv_back_top);
        iv_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listView.smoothScrollToPosition(0);
                iv_top.setVisibility(View.GONE);
            }
        });
    }



    @Override
    protected void loadDatas() {
        OkhttpUtil.downJSON(Contants.URL.FIRST_URL,this);
        loadListView();

    }

    private void loadListView() {
        lv_url = String.format(Contants.URL.RECOMMEND_LV_URL,page);
        OkhttpUtil.downJSON(lv_url, this);

    }


    /**
     * SwipeRfreshLayout的监听方法
     */
    @Override
    public void onRefresh() {
        loadDatas();
        swipeRefreshLayout.setRefreshing(false);//关闭刷新
    }

    /**
     * 下载完成回调
     * @param url
     * @param json
     */
    @Override
    public void onResponse(String url, String json) {
        /**
         * 隐藏加载时的布局,并关闭动画
         */
        fl_load.setVisibility(View.GONE);
        iv_animotion.clearAnimation();
        if (json != null) {
            if (url.equals(Contants.URL.FIRST_URL)) {
                //  Log.e(TAG, "onResponse: "+json );
                RecommendEntity recommendEntity = new Gson().fromJson(json, RecommendEntity.class);
                //获取三餐图片
                List<RecommendEntity.ObjEntity.SanCanEntity> san_can = recommendEntity.getObj().getSan_can();
                //获得三餐的标题
                List<RecommendEntity.ObjEntity.SanCanTitlesEntity> san_can_titles = recommendEntity.getObj().getSan_can_titles();
                //把两个集合都传过去
                viewPager.setDatas(san_can, san_can_titles);

                sortView.setDatas(recommendEntity);

                hotView.setDatas(recommendEntity);

                todayView.setDatas(recommendEntity);
            } else {
                ll_foot.setVisibility(View.GONE);
                YouLoveEntity youLoveEntity = new Gson().fromJson((String) json, YouLoveEntity.class);
                List<YouLoveEntity.ObjEntity.CustomizedEntity.DataEntity> data = youLoveEntity.getObj().getCustomized().getData();

                for (int i = 0;i<data.size();i+=2){

                    String title1 = data.get(i).getTitle();
                    String title2 = data.get(i+1).getTitle();
                    String titlePic1 = data.get(i).getTitlepic();
                    String titlePic2 = data.get(i+1).getTitlepic();
                    MyYLEntity entity = new MyYLEntity(titlePic1,titlePic2,title1,title2);
                    lv_datas.add(entity);
                }

                tv_youlove.setText(youLoveEntity.getObj().getCustomized().getTime());

                adapter.setDatas(lv_datas);

            }
        }
    }

    @Override
    public void onFailure(String url, String errorMsg) {
        L.e("下载失败"+errorMsg);
    }

    /**
     * listView的滑动监听
     * @param view
     * @param scrollState
     */
    private boolean isBottom = false;
    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        switch (scrollState){
            case SCROLL_STATE_FLING:
                break;
            case SCROLL_STATE_IDLE:
                break;
            case SCROLL_STATE_TOUCH_SCROLL:

                if (isBottom){

                    if (page<3){
                        ll_foot.setVisibility(View.VISIBLE);
                        page ++;
                        loadListView();
                    }else if (page==3){
                        //添加listview底部
                    }

                }
                break;
        }
    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        if (firstVisibleItem+visibleItemCount == totalItemCount){
            isBottom = true;
        }else {
            isBottom = false;
        }
    }

    /**
     * listView的触摸监听
     */
    private int dy = -1;
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (dy == -1){
            dy = (int) event.getY();
        }
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                dy = (int) event.getY();
                break;
            case MotionEvent.ACTION_MOVE:

                if (event.getY()-dy>0){
                    iv_top.setVisibility(View.VISIBLE);
                }else if (event.getY()-dy<0){
                    iv_top.setVisibility(View.GONE);
                }
                break;
        }
        return false;
    }
}
