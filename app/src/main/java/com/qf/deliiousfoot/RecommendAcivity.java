package com.qf.deliiousfoot;

import base.BaseActivity;
import fragment.RecommendFragment;

/**
 * 推荐页
 */
public class RecommendAcivity extends BaseActivity{



    @Override
    protected int contentView() {
        return R.layout.activity_recommend;
    }

    @Override
    protected void initViews() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_tj,new RecommendFragment()).commit();
    }
}
