package com.luise.asynctask.task;

import com.luise.common.logger.Logger;

/**
 * a abstract task class.
 * Created by john 
 * on 2017/3/17 10:35.
 */

public abstract class Task implements Runnable {


    public abstract void runTask();

    @Override
    public void run() {
        try {
            String str = "taskStart, threadName [ " + Thread.currentThread().getName() + "],taskName [ " + getClass().getSimpleName() + "]";
            long startTime = System.currentTimeMillis();
            runTask();
            long endTime = System.currentTimeMillis();
            Logger.debug(str + " ,costTime [" + (endTime - startTime) + "]");
        } catch (Exception e) {
            Logger.error("error in [" + getClass().getSimpleName() + "]" + e.getMessage());
            e.printStackTrace();
        }
    }
}
