package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebApplicationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplicationServerApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationArguments ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ((ListableBeanFactory) ctx).getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

}
