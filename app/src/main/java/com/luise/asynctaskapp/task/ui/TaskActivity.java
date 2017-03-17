package com.luise.asynctaskapp.task.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.luise.asynctask.task.Task;
import com.luise.asynctask.task.TaskHandler;
import com.luise.asynctask.task.TaskPool;
import com.luise.asynctaskapp.R;
import com.luise.asynctaskapp.task.Init2Task;
import com.luise.asynctaskapp.task.InitTask;
import com.luise.foundation.base.activity.CustomActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john 
 * on 2017/3/17 15:38.
 */

public class TaskActivity extends CustomActivity {

    private List<Task> mTasks;

    private TaskPool mTaskPool;

    private TaskHandler mTaskHandler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        initTaskInPool();

    }

    private void initTaskInPool() {
        mTasks = new ArrayList<>();
        InitTask initTask = new InitTask();
        Init2Task init2Task = new Init2Task();
        mTasks.add(initTask);
        mTasks.add(init2Task);
        mTaskPool = new TaskPool();
    }

    public void onClickStartTaskInPool(View view) {
        mTaskPool.executeTasks(mTasks);
    }

    public void onClickStartTaskInHandler(View view) {
        if (mTaskHandler==null){
            mTaskHandler = new TaskHandler();
        }
        mTaskHandler.addTasks(mTasks);
        mTaskHandler.executeTasks();
    }

}
