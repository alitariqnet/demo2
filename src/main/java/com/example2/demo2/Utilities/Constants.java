package com.example2.demo2.Utilities;

import org.springframework.stereotype.Component;

@Component
public final class Constants {
    final String appName = "MyApp";
    final String buildNo = "1.0.0";

    String getBuildNo(){
        return this.buildNo;
    }
    String getAppName(){
        return this.appName;
    }
}
