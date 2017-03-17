package com.luise.foundation.util;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;


import com.luise.foundation.base.ApplicationDelegate;

import java.util.HashMap;

/**
 * Created by john 
 * on 2017/3/16 13:51.
 */

public class AppUtil {

    private static HashMap<Class, Intent> sServiceList = new HashMap<>();
    private static ApplicationDelegate mApplicationDelegate;

    public static ApplicationDelegate getApplicationDelegate() {
        return mApplicationDelegate;
    }

    /**
     * set application delegate.You had better invoke it in Application.onCreate().
     * */
    public static void setApplicationDelegate(ApplicationDelegate mDelegate) {
        mApplicationDelegate = mDelegate;
    }

    /**
     * start a background intent service without data.
     * @param service
     * */
    public static void sendRequestToBackgroundService(Class service) {
        sendRequestToBackgroundService(service, null);
    }

    /**
     * start a background intent service with data.
     * @param service
     * @param uriString
     * */
    public static void sendRequestToBackgroundService(Class service, String uriString) {
        if (mApplicationDelegate != null) {
            Intent intent = new Intent(mApplicationDelegate.getApplication(), service);
            if (!TextUtils.isEmpty(uriString)) {
                intent.setData(Uri.parse(uriString));
            }
            if (mApplicationDelegate.getApplication() != null) {
                mApplicationDelegate.getApplication().startService(intent);
                sServiceList.put(service, intent);
            }
        }
    }

    /**
     * stop service.
     * */
    public static void stopService(Class service) {
        if (sServiceList.containsKey(service)) {
            mApplicationDelegate.getApplication().stopService(sServiceList.get(service));
        }
    }
}
