package com.example2.demo2.Streaming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Streaming {
    List l = Arrays.asList("Ali","Arsalan","Ahsan","Ammar","Bill","Becky","Billy",
                            "Bilal","Careem","Dan","Elephant","Fahad","George",
                            "Hamid","Imran","Johnny","James","Jamil","Josephine");
    Stream s = Stream.of(1,2,3,4);
    Stream a = Stream.of(l);

    String hello = "Hello to the world!";
    IntStream s2 = hello.chars();
    
    // can be written here but not inside main method
    // this code block will be run once on loading the
    // and not with every class object creation time
    static {
        System.out.println("inside static block inside Streaming");
    }

    // this instance block will be run every time an object is created
    {
        System.out.println("inside instance block");
    }
    public static void main(String[] args) {

        Streaming s =  new Streaming();
        Streaming r = new Streaming();

    }
}
