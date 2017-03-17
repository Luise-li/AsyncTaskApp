package com.luise.asynctaskapp.task;

import com.luise.asynctask.task.Task;
import com.luise.common.logger.Logger;

/**
 * Created by john 
 * on 2017/3/17 15:27.
 */

public class InitTask extends Task {
    @Override
    public void runTask() {
        try {
            Logger.debug("initTask start to sleep.");
            Thread.sleep(4000);
            Logger.debug("initTask end to sleep.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
