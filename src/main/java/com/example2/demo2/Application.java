package com.example2.demo2;

import com.example2.demo2.Service.KeyboardService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Application {

	public static Logger log = LogManager.getLogger(Application.class);
	public static void main(String[] args) {

//        SpringApplication application = new SpringApplication(Application.class);
//		var context = application.run(args);
//		log.info(context.getBean("Hello2").getClass().toGenericString());
		SpringApplication.run(Application.class, args);
//		 Arrays.stream(context.getBeanDefinitionNames()).toList().forEach((e)-> System.out.println(e.toString()));
	}

}
