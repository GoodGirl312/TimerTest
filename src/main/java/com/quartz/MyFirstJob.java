package com.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * @author ys
 * @Description
 * @Date 2019/4/30 15:34
 */
public class MyFirstJob implements Job {

    public MyFirstJob() {
    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("我的第一个定时任务执行了 at "
                + new Date() + " by " + jobExecutionContext.getTrigger().getJobKey());
    }
}
