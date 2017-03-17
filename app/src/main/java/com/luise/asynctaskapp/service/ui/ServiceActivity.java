package com.luise.asynctaskapp.service.ui;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.widget.Toast;

import com.luise.asynctaskapp.R;
import com.luise.asynctaskapp.service.BroadcastConstant;
import com.luise.asynctaskapp.service.WorkBroadcastReceiver;
import com.luise.asynctaskapp.service.WorkIntentService;
import com.luise.common.logger.Logger;
import com.luise.foundation.base.activity.CustomActivity;
import com.luise.foundation.util.AppUtil;


/**
 * Created by john 
 * on 2017/3/16 11:55.
 */

public class ServiceActivity extends CustomActivity {

    private WorkBroadcastReceiver mWorkBroadcastReceiver;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        AppUtil.sendRequestToBackgroundService(WorkIntentService.class, "发送的消息");

        mWorkBroadcastReceiver = new WorkBroadcastReceiver(this);
        IntentFilter intentFilter = new IntentFilter(BroadcastConstant.BROADCAST_ACTION_WORK);
        LocalBroadcastManager.getInstance(this).registerReceiver(mWorkBroadcastReceiver, intentFilter);
    }

    public void showMsgFromBackgroud(String msg) {
        Logger.debug(msg);
        if (TextUtils.isEmpty(msg)) {
            Toast.makeText(this, "收到的消息为 空", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "收到的消息为 " + msg, Toast.LENGTH_LONG).show();
        }
    }


}
