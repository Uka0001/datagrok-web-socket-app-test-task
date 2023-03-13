package com.example.datagrokspringwebapptt;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000);// simulated delay
        message.setLocalTime(LocalTime.now());
        return new Greeting("Hello, "
                + HtmlUtils.htmlEscape(message.getName()) + " ! "
                + "Your message: " /*+ HtmlUtils.htmlEscape(message.getDialog())*/
                + message.getLocalTime().format(DateTimeFormatter.ofPattern("hh:mm:ss")) + " sent");
    }

}