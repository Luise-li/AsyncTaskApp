package com.luise.asynctask.task;

import android.support.annotation.NonNull;

import java.util.concurrent.ThreadFactory;

/**
 * A factory to create new threads.
 * Created by john 
 * on 2017/3/17 10:21.
 */

public class TaskThreadFactory implements ThreadFactory {
    private ThreadGroup mGroup;

    private String mNewThreadName;

    public TaskThreadFactory(ThreadGroup group, String newThreadName) {
        mGroup = group;

        mNewThreadName = newThreadName;
    }

    @Override
    public Thread newThread(@NonNull Runnable r) {
        return new Thread(mGroup, r, mNewThreadName, 524288L);
    }
}
