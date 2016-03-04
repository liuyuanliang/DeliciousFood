package custem;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.qf.deliiousfoot.R;

import java.util.List;

import model.RecommendEntity;
import util.FrescoUtil;

/**
 * Created by admin on 2016/2/27.
 */
public class RecommendSortView extends LinearLayout{

    private static final String TAG = "print";
    private SimpleDraweeView sdv_sort;//分类图片
    private SimpleDraweeView sdv_video;//视频图片
    private SimpleDraweeView sdv_zc;//早餐图片
    private SimpleDraweeView sdv_nearby;//附近图片
    private SimpleDraweeView sdv_favorite;//排行榜图片
    private SimpleDraweeView sdv_food;//组菜图片
    private TextView tv_sort;//分类标题
    private TextView tv_video;//视频标题
    private TextView tv_zc;//早餐标题
    private TextView tv_nearby;//附近标题

    public RecommendSortView(Context context) {
        super(context);
        init();
    }

    /**
     * 初始化方法
     */
    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.recomend_sort_layout,this,true);
        sdv_sort = (SimpleDraweeView) findViewById(R.id.sdv_sort_sort);
        sdv_video = (SimpleDraweeView) findViewById(R.id.sdv_sort_video);
        sdv_zc = (SimpleDraweeView) findViewById(R.id.sdv_sort_zc);
        sdv_nearby = (SimpleDraweeView) findViewById(R.id.sdv_sort_nearby);
        sdv_favorite = (SimpleDraweeView) findViewById(R.id.sdv_sort_favorite);
        sdv_food = (SimpleDraweeView) findViewById(R.id.sdv_sort_food);
        tv_sort = (TextView) findViewById(R.id.tv_sort_sort);
        tv_video = (TextView) findViewById(R.id.tv_sort_video);
        tv_zc = (TextView) findViewById(R.id.tv_sort_zc);
        tv_nearby = (TextView) findViewById(R.id.tv_sort_nearby);
    }

    /**
     * 提供一个外部传入数据的方法
     * @param recommendEntity
     */
    public void setDatas(RecommendEntity recommendEntity){
        List<RecommendEntity.ObjEntity.FenleiEntity> fenlei = recommendEntity.getObj().getFenlei();
        RecommendEntity.ObjEntity.Func1Entity func1 = recommendEntity.getObj().getFunc1();
        RecommendEntity.ObjEntity.Func2Entity func2 = recommendEntity.getObj().getFunc2();


        FrescoUtil.bindImageView(fenlei.get(0).getImage(),sdv_sort);
        tv_sort.setText(fenlei.get(0).getTitle());
        FrescoUtil.bindImageView(fenlei.get(1).getImage(), sdv_video);
        tv_video.setText(fenlei.get(0).getTitle());
        FrescoUtil.bindImageView(fenlei.get(2).getImage(), sdv_zc);
        tv_zc.setText(fenlei.get(0).getTitle());
        FrescoUtil.bindImageView(fenlei.get(3).getImage(), sdv_nearby);
        tv_nearby.setText(fenlei.get(0).getTitle());

        FrescoUtil.bindImageView(func1.getImage(), sdv_favorite);
        FrescoUtil.bindImageView(func2.getImage(),sdv_food);
    }
}
