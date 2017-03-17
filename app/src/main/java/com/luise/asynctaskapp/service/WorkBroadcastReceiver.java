package com.luise.asynctaskapp.service;

import android.content.Context;
import android.content.Intent;

import com.luise.asynctask.intentservice.CustomBroadcastReceiver;
import com.luise.asynctaskapp.service.ui.ServiceActivity;


import java.lang.ref.WeakReference;

/**
 * Created by john 
 * on 2017/3/16 14:40.
 */

public class WorkBroadcastReceiver extends CustomBroadcastReceiver {
    private WeakReference<ServiceActivity> mReference;

    public WorkBroadcastReceiver(ServiceActivity activity) {
        mReference = new WeakReference<>(activity);
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        ServiceActivity activity = mReference.get();
        if (activity != null) {
            activity.showMsgFromBackgroud(intent.getStringExtra(BroadcastConstant.BROADCAST_ACTION_DATA_STATUS));
        }
    }
}
