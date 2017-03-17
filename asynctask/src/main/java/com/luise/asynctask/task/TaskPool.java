package com.luise.asynctask.task;

import android.os.Handler;
import android.os.Looper;

import com.luise.common.util.CollectionUtil;

import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * a thread pool.
 * Created by john 
 * on 2017/3/17 13:59.
 */

public class TaskPool {
    //pool basic config : corePoolSize 1,maximumPoolSize 5,keepAliveTime 2,unit SECONDS ,workQueue 1000
    private static ThreadPoolExecutor sThreadPoolExecutor = new ThreadPoolExecutor(1, 5, 2L, TimeUnit.SECONDS, new LinkedBlockingQueue(1000), new TaskThreadFactory(null, "taskThread"));
    private static Handler mHander = new Handler(Looper.getMainLooper());

    public TaskPool() {
        sThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /**
     * execute batch tasks in a pool at once.
     * @param tasks task collection need to execute.
     * */
    public void executeTasks(List<Task> tasks) {
        if (CollectionUtil.isEmpty(tasks)) {
            return;
        }
        for (Task task : tasks) {
            sThreadPoolExecutor.execute(task);
        }
    }

    /**
     * add task into the thread pool  every 1/delay*200 milliseconds.
     * */
    public void executeTasks(List<Task> tasks, long delay) {
        if (CollectionUtil.isEmpty(tasks)) {
            return;
        }
        int i = 0;
        for (Task task : tasks) {
            mHander.postDelayed(new TaskInsertor(task), i / delay * 200);
            i++;
        }
    }

    /**
     * expose ThreadPoolExecutor object.
     * */
    public static ThreadPoolExecutor getThreadPoolExecutor() {
        return sThreadPoolExecutor;
    }
}
