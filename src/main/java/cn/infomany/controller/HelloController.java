package cn.infomany.controller;

import cn.infomany.service.MailService;
import cn.infomany.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private ScheduleService scheduleService;

    @Autowired
    private MailService mailService;

    @GetMapping("/testAsync")
    public String testAsync() {
        scheduleService.testAsync();
        return "执行完毕";
    }

    @GetMapping("sendSimpleMail")
    public String sendSimpleMail() {
        mailService.sendMail("592466695@qq.com", "开会", "今天下午7点开会");
        return "发送成功";
    }

    @GetMapping("sendHttpMail")
    public String sendHttpMail() {
        mailService.sendHtmlMail("592466695@qq.com", "helloworld应用", "helloworld<p style='color:red;'>应用<p>");
        return "发送成功";
    }
}
