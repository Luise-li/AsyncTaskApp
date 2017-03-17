package com.luise.foundation.base;

import android.app.Application;

/**
 * Created by john 
 * on 2017/3/16 14:00.
 */

public class ApplicationDelegate<T extends Application> {
    private T mApplcation;

    public ApplicationDelegate(T applcation) {
        mApplcation = applcation;
    }

    public void onCreate() {

    }



    public T getApplication() {
        return mApplcation;
    }
}
