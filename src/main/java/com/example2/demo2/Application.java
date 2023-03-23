package com.example2.demo2;

import com.example2.demo2.Service.KeyboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	@Autowired
	public static KeyboardService p = new KeyboardService();;

	public static void main(String[] args) {

		try {
			System.out.println(p.getClass());
		}catch (Exception e){
			e.printStackTrace();
		}
        SpringApplication application = new SpringApplication(Application.class);
		var context = application.run(args);
		System.out.println(context.getBean("Hello2").getClass().toGenericString());
//		var context = SpringApplication.run(Demo2Application.class, args);
		// Arrays.stream(context.getBeanDefinitionNames()).toList().forEach((e)-> System.out.println(e.toString()));
	}

}
