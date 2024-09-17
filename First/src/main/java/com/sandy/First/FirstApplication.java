package com.sandy.First;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstApplication {
	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(FirstApplication.class, args);
		laptop lap=context.getBean(laptop.class);
		lap.compile();
		dekstop dek=context.getBean(dekstop.class);
		dek.compile();
	}
}
