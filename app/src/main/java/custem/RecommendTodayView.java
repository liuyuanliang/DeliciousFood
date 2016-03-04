package custem;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.qf.deliiousfoot.R;

import java.util.List;

import model.RecommendEntity;
import util.FrescoUtil;

/**
 * Created by admin on 2016/2/28.
 */
public class RecommendTodayView extends LinearLayout{


    private SimpleDraweeView sdv_jrtj_1;
    private SimpleDraweeView sdv_jrtj_2;
    private SimpleDraweeView sdv_jrtj_3;
    private SimpleDraweeView sdv_jrtj_4;
    private TextView tv_jrtj_1;
    private TextView tv_jrtj_2;
    private TextView tv_jrtj_3;

    public RecommendTodayView(Context context) {
        super(context);
        init();
    }

    /**
     * 初始化
     */
    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.recommend_jrtj_layout,this,true);

        sdv_jrtj_1 = (SimpleDraweeView) findViewById(R.id.sdv_jrtj_1);
        sdv_jrtj_2 = (SimpleDraweeView) findViewById(R.id.sdv_jrtj_2);
        sdv_jrtj_3 = (SimpleDraweeView) findViewById(R.id.sdv_jrtj_3);
        sdv_jrtj_4 = (SimpleDraweeView) findViewById(R.id.sdv_jrtj_4);

        tv_jrtj_1 = (TextView) findViewById(R.id.tv_jrtj_1);
        tv_jrtj_2 = (TextView) findViewById(R.id.tv_jrtj_2);
        tv_jrtj_3 = (TextView) findViewById(R.id.tv_jrtj_3);

    }

    public void setDatas(RecommendEntity recommendEntity){

        List<RecommendEntity.ObjEntity.ZtEntity> list = recommendEntity.getObj().getZt();

        tv_jrtj_1.setText(list.get(0).getTitle());
        tv_jrtj_1.setText(list.get(1).getTitle());
        tv_jrtj_1.setText(list.get(2).getTitle());

        FrescoUtil.bindImageView(list.get(0).getPhoto(),sdv_jrtj_1);
        FrescoUtil.bindImageView(list.get(1).getPhoto(),sdv_jrtj_2);
        FrescoUtil.bindImageView(list.get(2).getPhoto(),sdv_jrtj_3);

    }
}
