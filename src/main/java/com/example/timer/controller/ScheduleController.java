package com.example.timer.controller;

import com.example.timer.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @RequestMapping("/index")
    public String execute() {
        scheduleService.executorTask();
        return "success";
    }
}
