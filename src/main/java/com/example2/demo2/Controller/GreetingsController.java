package com.example2.demo2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingsController {

    @RequestMapping("/greetings")
    public String greetings(){
        return "greetings.html";
    }
}
