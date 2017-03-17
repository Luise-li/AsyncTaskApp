package com.luise.asynctaskapp;

import android.app.Application;
import android.content.Context;

import com.luise.foundation.base.ApplicationDelegate;
import com.luise.foundation.util.AppUtil;


/**
 * Created by john 
 * on 2017/3/16 14:01.
 */

public class BaseApplication extends Application {
    private ApplicationDelegate mApplicationDelegate;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationDelegate = new ApplicationDelegate(this);
        AppUtil.setApplicationDelegate(mApplicationDelegate);
    }

    
}
