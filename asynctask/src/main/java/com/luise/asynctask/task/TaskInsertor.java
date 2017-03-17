package com.luise.asynctask.task;

/**
 * A worker thread for add task into the thread pool.
 * Created by john 
 * on 2017/3/17 14:34.
 */

public class TaskInsertor implements Runnable {
    private Task mTask;

    public TaskInsertor(Task task) {
        mTask = task;
    }

    @Override
    public void run() {
        TaskPool.getThreadPoolExecutor().execute(mTask);
    }
}
