package com.luise.asynctask.intentservice;

import android.app.IntentService;

/**
 * custom IntentService class.It only do what is one way of async.
 * All IntentServices need to register in manifest.xml.
 * Created by john 
 * on 2017/3/16 11:41.
 */

public abstract class CustomIntentService extends IntentService {
    public CustomIntentService(String name) {
        super(name);
    }
}
