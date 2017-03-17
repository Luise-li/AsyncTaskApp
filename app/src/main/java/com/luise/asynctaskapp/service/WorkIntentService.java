package com.luise.asynctaskapp.service;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;


import com.luise.asynctask.intentservice.CustomIntentService;
import com.luise.common.logger.Logger;

/**
 * Created by john 
 * on 2017/3/16 11:50.
 */

public class WorkIntentService extends CustomIntentService {

    public WorkIntentService(){
        super("WorkIntentService");
    }

    public WorkIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        String dataString = intent.getDataString();
        Logger.debug(dataString);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent reportIntent = new Intent(BroadcastConstant.BROADCAST_ACTION_WORK);
        reportIntent.putExtra(BroadcastConstant.BROADCAST_ACTION_DATA_STATUS, dataString + "，经过处理了");
        LocalBroadcastManager.getInstance(this).sendBroadcast(reportIntent);

    }
}
