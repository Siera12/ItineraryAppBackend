package com.iris.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAutoConfiguration
@EntityScan("com.iris.entity")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages= {"com.iris.repository"})
@ComponentScan({"com.iris,controller","com.iris.service"})
public class MainApp {


	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);

	}
	
}
