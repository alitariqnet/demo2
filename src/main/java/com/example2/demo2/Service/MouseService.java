package com.example2.demo2.Service;

import com.example2.demo2.Interfaces.Peripheral;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MouseService implements Peripheral {
    public String className= "MouseService";

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
