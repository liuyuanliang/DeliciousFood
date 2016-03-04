package com.qf.deliiousfoot;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import adapter.NavViewPagerAdapter;
import base.BaseActivity;

/**
 * Created by admin on 2016/2/25.
 */
public class NavigationActivity extends BaseActivity implements ViewPager.OnPageChangeListener {


    private static final String TAG = "print";

    private Handler handler = new Handler();

    private ViewPager viewPager;
    private boolean isLast = false;//标志位，表示是否是最后一张
    private List<String> datas;

    @Override
    protected int contentView() {
        return R.layout.activity_navigation;
    }

    @Override
    protected void initViews() {
        viewPager = (ViewPager) findViewById(R.id.vp_nav);
    }

    @Override
    protected void loadDatas() {
        datas = new ArrayList<>();
        datas.add("res:///" + R.drawable.introduct_1);
        datas.add("res:///" + R.drawable.introduct_2);
        datas.add("res:///" + R.drawable.introduct_3);
        datas.add("res:///" + R.drawable.introduct_4);

        NavViewPagerAdapter adapter = new NavViewPagerAdapter(getSupportFragmentManager(), datas);

        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(this);

    }

    private float x = -1f;
    private float dx = -1f;
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        if (isLast){
            viewPager.setCurrentItem(datas.size());
            if (x==-1){
                x = positionOffset;
            }else {
                dx = x - positionOffset;
                x=positionOffset;
            }
        }
    }
    @Override
    public void onPageSelected(int position) {
        if (position==datas.size()-1){
            isLast=true;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        switch (state){
            case ViewPager.SCROLL_STATE_DRAGGING:
                break;
            case ViewPager.SCROLL_STATE_IDLE:
//                Log.e(TAG, "SCROLL_STATE_IDLE: dx" + dx);
                if (dx>0){
                    startActivity(new Intent(NavigationActivity.this, RecommendAcivity.class));
                    finish();
                }
                break;
            case ViewPager.SCROLL_STATE_SETTLING:
                break;
        }
    }
}
