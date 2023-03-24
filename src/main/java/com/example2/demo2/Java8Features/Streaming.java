package com.example2.demo2.Java8Features;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Streaming {
    private static final Logger log =
            LogManager.getLogger(Streaming.class);
    
    // can be written here but not inside main method
    // this code block will be run once on loading the
    // and not with every class object creation time
    static {
        log.info("inside static block inside Streaming");
    }

    // this instance block will be run every time an object is created
    {
        log.info("inside instance block");
    }
    public static void main(String[] args) throws InterruptedException {
        //instance block will print two times
        Streaming a = new Streaming();
        Streaming b = new Streaming();

        List l = Arrays.asList("Ali","Arsalan","Ahsan","Ammar","Bill","Becky","Billy",
                "Bilal","Careem","Dan","Elephant","Fahad","George",
                "Hamid","Imran","Johnny","James","Jamil","Josephine");

        // example of stream with forEach with method reference
        l.stream().forEach(System.out::println);

        String hello = "Hello to the world!";
    try {
        IntStream s2 = hello.chars();
        s2.forEachOrdered(x-> System.out.print(x+", "));
        Thread.sleep(2000);
        // this line causing error because s2 stream is already closed
        s2.forEach(x-> System.out.print(x+", "));
    }catch (Exception e){
        log.error("some error");
        e.printStackTrace();
    }finally{
        log.info("ending execution!");
    }

    }
}
