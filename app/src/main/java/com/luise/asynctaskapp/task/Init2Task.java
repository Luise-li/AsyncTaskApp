package com.luise.asynctaskapp.task;

import com.luise.asynctask.task.Task;
import com.luise.common.logger.Logger;

/**
 * Created by john 
 * on 2017/3/17 15:27.
 */

public class Init2Task extends Task {
    @Override
    public void runTask() {
        try {
            Logger.debug("init2Task start to sleep.");
            Thread.sleep(6000);
            Logger.debug("init2Task end to sleep.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
