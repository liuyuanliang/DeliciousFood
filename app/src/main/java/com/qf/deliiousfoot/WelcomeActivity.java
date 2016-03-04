package com.qf.deliiousfoot;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;

import base.BaseActivity;

/**
 *  欢迎页
 */
public class WelcomeActivity extends BaseActivity{

    private SharedPreferences preferences;

    private Handler handler = new Handler();
    private SharedPreferences.Editor edit;

    @Override
    protected int contentView() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void initViews() {

        preferences = getSharedPreferences("phone", Context.MODE_PRIVATE);

        if (preferences.getBoolean("firststart",true)){
            edit = preferences.edit();

            edit.putBoolean("firststart",false);
            edit.commit();

            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            startActivity(new Intent(WelcomeActivity.this, NavigationActivity.class));
                            finish();
                        }
                    });
                }
            }, 3000);
        }else {
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            startActivity(new Intent(WelcomeActivity.this, RecommendAcivity.class));
                            finish();
                        }
                    });
                }
            }, 3000);

        }
    }
}
