package cn.infomany.controller;

import cn.infomany.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/testAsync")
    public String testAsync() {
        scheduleService.testAsync();
        return "执行完毕";
    }
}
