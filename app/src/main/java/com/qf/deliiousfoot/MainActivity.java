package com.qf.deliiousfoot;

import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

import base.BaseActivity;

public class MainActivity extends BaseActivity {


    @Override
    protected int contentView() {
        return R.layout.animation_layout;
    }

    @Override
    protected void initViews() {
        ImageView imageView = (ImageView) findViewById(R.id.iv_ani);
        imageView.setBackgroundResource(R.drawable.animation_list); //将帧动画资源文件作为View控件背景

        AnimationDrawable rocketAnimation = (AnimationDrawable) imageView.getBackground(); //获取背景并强转成为帧动画对象

        rocketAnimation.start();
    }
}