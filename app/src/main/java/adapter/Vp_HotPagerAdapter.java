package adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import model.RecommendEntity;
import util.FrescoUtil;

/**
 * 头部热卖商品的viewpager的适配器
 */
public class Vp_HotPagerAdapter extends PagerAdapter{


    private Context context;
    private RecommendEntity recommendEntity;

    private List<SimpleDraweeView> datas = new ArrayList<>();

    public Vp_HotPagerAdapter(Context context, RecommendEntity recommendEntity) {
        this.context = context;
        this.recommendEntity = recommendEntity;
        List<RecommendEntity.ObjEntity.Top3Entity> list = recommendEntity.getObj().getTop3();
        //获得布局参数
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        for (int i=0;i<list.size();i++){
            /**
             * 添加图片
             */
            SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
            simpleDraweeView.setScaleType(ImageView.ScaleType.FIT_XY);
            simpleDraweeView.setLayoutParams(params);
            String photo = list.get(i).getPhoto();
            FrescoUtil.bindImageView(photo,simpleDraweeView);
            datas.add(simpleDraweeView);
        }
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(datas.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(datas.get(position));
        return datas.get(position);
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
}
