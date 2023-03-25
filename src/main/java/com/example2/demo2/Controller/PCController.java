package com.example2.demo2.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class PCController {
    @RequestMapping("/pc")
    public void Hello(){
        System.out.println("Personal Computer");
    }

}
