package com.example.datagrokspringwebapptt.controller;

import com.example.datagrokspringwebapptt.dto.Greeting;
import com.example.datagrokspringwebapptt.model.HelloMessage;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000);// simulated delay
        message.setLocalTime(LocalTime.now());
        return new Greeting("Hello, "
                + HtmlUtils.htmlEscape(message.getFrom()) + " ! "
                + "Your message to: " + HtmlUtils.htmlEscape(message.getTo())
                + " are: " + HtmlUtils.htmlEscape(message.getDialog())
                + ", sent at: "
                + message.getLocalTime().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
    }

}
