package com.luise.common.logger;

import android.util.Log;

/**
 * Created by john 
 * on 2017/3/16 13:12.
 */

public class Logger {
    public static boolean release = false;
    public static String TAG = "logger";


    /**
     * @param out
     * */
    public static void debug(String out) {
        debug(TAG, out);
    }

    /**
     * @param tag
     * @param out
     * */
    public static void debug(String tag, String out) {
        if (!release) {
            Log.d(tag, out);
        }
    }

    /**
     * @param error
     * */
    public static void error(String error) {
        error(TAG, error);
    }

    /**
     * @param tag
     * @param error
     * */
    public static void error(String tag, String error) {
        if (!release) {
            Log.e(tag, error);
        }
    }
}
