package adapter;

import android.content.Context;

import com.qf.deliiousfoot.R;

import java.util.List;

import base.AbsBaseAdapter;
import model.MyYLEntity;

/**
 * Created by admin on 2016/3/1.
 */
public class MyRecommend_lv_Adapter extends AbsBaseAdapter<MyYLEntity>{


    public MyRecommend_lv_Adapter(Context context) {
        super(context, R.layout.item_recommend);
    }

    @Override
    public void bindDatas(ViewHolder viewHolder, MyYLEntity data) {

        viewHolder.bindTextView(R.id.tv_tj_lv_1,data.getTitle1())
                .bindSimpleDraweeView(R.id.sdv_tj_lv_1,data.getTitlePic1())
                .bindTextView(R.id.tv_tj_lv_2,data.getTitle2())
                .bindSimpleDraweeView(R.id.sdv_tj_lv_2,data.getTitlePic2());
    }
}
