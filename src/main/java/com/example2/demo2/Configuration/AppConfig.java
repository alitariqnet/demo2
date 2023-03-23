package com.example2.demo2.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig extends Thread{


    @Bean(name="Hello2")
    @Scope("singleton")
    public void Hello2(){
        System.out.println("Hello2");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread();
        Thread t2 = new Thread();
        t2.start();
        t.start();
        System.err.println(t.getId());
        byte b = (byte)t2.getId();
        System.out.write(b);
        try {
            final List<String> list = Arrays.asList("Umar", "Ali", "Hassan");
//            list.add(1, "baba");
//            list.remove(1);
            for (String e : list) {
                System.out.println(e);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("it's over!");
        }
        System.out.println(t.getId());

    }


}
