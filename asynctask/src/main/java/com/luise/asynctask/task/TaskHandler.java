package com.luise.asynctask.task;

import android.os.Handler;
import android.os.Message;

import com.luise.common.util.CollectionUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * A task Handler to execute any tasks in the thread that the hander attaches.
 * Created by john 
 * on 2017/3/17 14:52.
 */

public class TaskHandler extends Handler {
    private static final int FLAG_EXECUTE_TASK = 5001;
    private List<Task> mTasks = new ArrayList<>();
    private boolean pause = false;


    /**
     * add tasks.
     * @param tasks
     * */
    public void addTasks(List<Task> tasks) {
        if (CollectionUtil.isEmpty(tasks)) {
            return;
        }
        synchronized (mTasks) {
            mTasks.addAll(tasks);
        }
    }

    /**
     * start to execute tasks.
     * */
    public void executeTasks() {
        sendEmptyMessage(FLAG_EXECUTE_TASK);
    }

    /**
     * pause to execute tasks
     * */
    public void pause() {
        pause = true;
    }

    /**
     * continue to execute tasks after pause.
     * */
    public void continues() {
        pause = false;
        executeTasks();
    }

    @Override
    public void handleMessage(Message msg) {
        if (msg.what == FLAG_EXECUTE_TASK) {
            handleTask();
        } else {
            super.handleMessage(msg);
        }
    }


    private void handleTask() {
        if (pause) {
            return;
        }
        synchronized (mTasks) {
            if (mTasks.size() <= 0) {
                return;
            }
        }
        mTasks.remove(0).run();
        executeTasks();
    }
}
