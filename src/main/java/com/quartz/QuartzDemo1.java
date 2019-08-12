package com.quartz;

import org.quartz.*;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.calendar.HolidayCalendar;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import java.util.Date;

/**
 * @author ys
 * @Description
 * @Date 2019/4/30 15:19
 */
public class QuartzDemo1 {

    public static void main(String[] args) {
        try {

            //Scheduler scheduler = new StdSchedulerFactory("quartz.properties").getScheduler();
            Scheduler scheduler = new SchedulerFactoryBean().getScheduler();
            /*HolidayCalendar calendar = new HolidayCalendar();
            calendar.addExcludedDate(new Date(2019,5,5));
            scheduler.addCalendar("myCalander",calendar,false,false);*/
            JobDetail jobDetail = JobBuilder.newJob(MyFirstJob.class).withIdentity("first", "first").build();

            /*CronScheduleBuilder scheduleBuilder = CronScheduleBuilder
                    .cronSchedule("0/5 * * * * ?");
            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("first", "first").withSchedule(scheduleBuilder).build();
            scheduler.scheduleJob(jobDetail, trigger);*/

            /*SimpleTrigger simpleTrigger = TriggerBuilder.newTrigger()
                    .withIdentity("first","first").
                    startAt(new Date())
                    .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(10).withRepeatCount(3))
                    .forJob(jobDetail).build();
            scheduler.scheduleJob(jobDetail, simpleTrigger);*/

            CronTrigger cronTrigger = TriggerBuilder.newTrigger().
                    withIdentity("first","first")
                    .withSchedule(CronScheduleBuilder.cronSchedule("0/5 26 14 * * ?"))
                    .build();

            scheduler.scheduleJob(jobDetail, cronTrigger);


            scheduler.start();

            System.out.println("==============");
            Thread.sleep(60000);
            scheduler.shutdown();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
