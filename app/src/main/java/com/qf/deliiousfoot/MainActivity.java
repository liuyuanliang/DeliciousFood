package com.qf.deliiousfoot;

import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

import base.BaseActivity;

public class MainActivity extends BaseActivity {

    /**
     * 这是一个测试用的Activity
     * 去死吧
     * @return
     */
    @Override
    protected int contentView() {
        return R.layout.animation_layout;
    }

    /**
     * 乙修改
     * 从头再来吧
     * 那就来呗
     * 这次行了,只要不放弃一切都有可能的,加油吧
     * 嗯,再接再励!爆发吧
     */
    @Override
    protected void initViews() {
        ImageView imageView = (ImageView) findViewById(R.id.iv_ani);
        imageView.setBackgroundResource(R.drawable.animation_list); //将帧动画资源文件作为View控件背景

        AnimationDrawable rocketAnimation = (AnimationDrawable) imageView.getBackground(); //获取背景并强转成为帧动画对象

        rocketAnimation.start();
        /**
         * 甲修改了
         */
    }
}
