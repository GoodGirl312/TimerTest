package com.example.timer.service;

import com.example.timer.entity.Schedule;
import com.example.timer.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;
    private ScheduledExecutorService scheduledExecutorService;
    private List<Schedule> schedules;
    private long start;

    public void executorTask() {
        schedules=scheduleRepository.findByStatus(1);
        this.start = System.currentTimeMillis();
        this.scheduledExecutorService = new ScheduledThreadPoolExecutor(schedules.size());
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (Schedule s : schedules) {
            scheduledExecutorService.schedule(()->System.out.println("任务" +
                    s.getTaskName() +"应该在"+s.getTaskTime()+"时间执行，实际执行时间："+format.format(new Date())),
                    s.getTaskTime().getTime() - start, TimeUnit.MILLISECONDS);
        }
    }
}
