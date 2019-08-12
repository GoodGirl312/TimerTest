package com.example.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceTest {

    private ScheduledExecutorService service;
    private long start;

    public ScheduledExecutorServiceTest() {
        this.service = new ScheduledThreadPoolExecutor(2);
        this.start = System.currentTimeMillis();
    }

    public void testOne() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = format.parse("2018-7-30 11:44:00");
        service.schedule(() -> System.out.println("testOne 开始执行！" + date), date.getTime() - start, TimeUnit.MILLISECONDS);
    }

    public void testTwo() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = format.parse("2018-7-30 11:43:00");
        service.schedule(() -> System.out.println("testTwo 开始执行！" + date), date.getTime() - start, TimeUnit.MILLISECONDS);
    }

    public static void main(String[] args) throws ParseException {
        ScheduledExecutorServiceTest test = new ScheduledExecutorServiceTest();
        test.testOne();
        test.testTwo();
    }

}
