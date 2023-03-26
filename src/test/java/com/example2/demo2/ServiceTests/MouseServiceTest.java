package com.example2.demo2.ServiceTests;

import com.example2.demo2.Service.MouseService;
import lombok.extern.slf4j.XSlf4j;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;
class MouseServiceTest {
    @Autowired
    MouseService ms;
    @Autowired
    Logger log;
    @Test
    void getClassName() {
        assertNotNull(ms.getClassName());
    }

    @Test
    void setClassName() {
        String cnOld = ms.getClassName();
        ms.setClassName("temp");
        assertNotEquals(cnOld,ms.getClassName());
        ms.setClassName(cnOld);
    }
}