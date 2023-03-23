package com.example2.demo2.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("/welcome")
    public String welcome(){
        return "<H1>Hey there welcome!</H1>";
    }
}
