package custem;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.qf.deliiousfoot.R;

import java.util.List;

import adapter.Vp_HotPagerAdapter;
import model.RecommendEntity;
import util.FrescoUtil;

/**
 * 最热商品viewpager
 */
public class RecommendHotView extends LinearLayout implements ViewPager.OnPageChangeListener {

    private FragmentManager manager;
    private ViewPager viewPager;
    private NavView navView;

    /**
     * 4张图片
     */
    private SimpleDraweeView sdv_hot_1;
    private SimpleDraweeView sdv_hot_2;
    private SimpleDraweeView sdv_hot_3;
    private SimpleDraweeView sdv_hot_4;

    /**
     * 8个文本
     */
    private TextView tv_hot_1;
    private TextView tv_hot_2;
    private TextView tv_hot_3;
    private TextView tv_hot_4;
    private TextView tv_hot_5;
    private TextView tv_hot_6;
    private TextView tv_hot_7;
    private TextView tv_hot_8;
    private List<RecommendEntity.ObjEntity.ShopsEntity> shops;

    public RecommendHotView(Context context,FragmentManager manager) {
        super(context);
        this.manager = manager;
        init();
    }

    /**
     * 初始化
     */
    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.recommend_hot_vp_layout,this,true);


        sdv_hot_1 = (SimpleDraweeView) findViewById(R.id.sdv_hot_1);
        sdv_hot_2 = (SimpleDraweeView) findViewById(R.id.sdv_hot_2);
        sdv_hot_3 = (SimpleDraweeView) findViewById(R.id.sdv_hot_3);
        sdv_hot_4 = (SimpleDraweeView) findViewById(R.id.sdv_hot_4);

        tv_hot_1 = (TextView) findViewById(R.id.tv_hot_1);
        tv_hot_2 = (TextView) findViewById(R.id.tv_hot_2);
        tv_hot_3 = (TextView) findViewById(R.id.tv_hot_3);
        tv_hot_4 = (TextView) findViewById(R.id.tv_hot_4);
        tv_hot_5 = (TextView) findViewById(R.id.tv_hot_5);
        tv_hot_6 = (TextView) findViewById(R.id.tv_hot_6);
        tv_hot_7 = (TextView) findViewById(R.id.tv_hot_7);
        tv_hot_8 = (TextView) findViewById(R.id.tv_hot_8);

        viewPager = (ViewPager) findViewById(R.id.vp_hot);
        navView = (NavView) findViewById(R.id.nv_hot);
        viewPager.addOnPageChangeListener(this);
    }


    /**
     * 提供一个外部传入数据的方法
     */
    public void setDatas(RecommendEntity recommendEntity){

        shops = recommendEntity.getObj().getShops();

        FrescoUtil.bindImageView(shops.get(0).getImage(),sdv_hot_1);
        tv_hot_1.setText(shops.get(0).getTitle());
        tv_hot_2.setText("￥"+ shops.get(0).getPrice()+"/"+ shops.get(0).getGuige());

        FrescoUtil.bindImageView(shops.get(1).getImage(), sdv_hot_2);
        tv_hot_3.setText(shops.get(1).getTitle());
        tv_hot_4.setText("￥"+ shops.get(1).getPrice()+"/"+ shops.get(1).getGuige());

        FrescoUtil.bindImageView(shops.get(2).getImage(), sdv_hot_3);
        tv_hot_5.setText(shops.get(2).getTitle());
        tv_hot_6.setText("￥"+ shops.get(2).getPrice()+"/"+ shops.get(2).getGuige());

        FrescoUtil.bindImageView(shops.get(3).getImage(), sdv_hot_4);
        tv_hot_7.setText(shops.get(3).getTitle());
        tv_hot_8.setText("￥"+ shops.get(3).getPrice()+"/"+ shops.get(3).getGuige());


        navView.setCount(recommendEntity.getObj().getTop3().size());
        Vp_HotPagerAdapter adapter = new Vp_HotPagerAdapter(getContext(),recommendEntity);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(1);
    }

    /**
     * viewPager的监听器
     * @param position
     * @param positionOffset
     * @param positionOffsetPixels
     */

    private boolean isLast = false;
    private float x = -1f;
    private float dx = -1f;
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        if (isLast){
            if (x==-1){
                x = positionOffset;
            }else {
                dx = x - positionOffset;
                x=positionOffset;
            }
            if (dx==0){
                viewPager.setCurrentItem(0);
                isLast = false;
            }
        }
        if (navView.getCount()>0){
            navView.setNavAddress(position,positionOffset);
        }

    }

    @Override
    public void onPageSelected(int position) {
        if (position==shops.size()){
            isLast = true;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
