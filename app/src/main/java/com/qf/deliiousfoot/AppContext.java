package com.qf.deliiousfoot;

import android.app.Application;

import util.FrescoUtil;
import util.OkhttpUtil;

/**
 * Created by admin on 2016/2/25.
 */
public class AppContext extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        OkhttpUtil.initOkHttp();
        FrescoUtil.initFresco(this);//记得初始化
    }
}
