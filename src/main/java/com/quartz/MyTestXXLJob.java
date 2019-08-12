package com.quartz;

import com.entity.XxlJobInfo;

/**
 * @author ys
 * @Description
 * @Date 2019/5/5 15:40
 */
public class MyTestXXLJob {
    public static void main(String[] args) {
        XxlJobInfo job = new XxlJobInfo();
        job.setJobGroup(1);
        job.setJobDesc("测试bbb");
        job.setExecutorRouteStrategy("first");
        job.setJobCron("0/5 * 17 * * ? *");
        job.setGlueType("BEAN");
        job.setExecutorHandler("httpJobHandler");
        job.setExecutorBlockStrategy("SERIAL_EXECUTION");
        job.setExecutorTimeout(0);
        job.setAuthor("bb");


    }
}

