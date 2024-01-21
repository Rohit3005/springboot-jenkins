package com.demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application started....");
	}

	public static void main(String[] args) {
		logger.info("Application Executed......");
		logger.info("Application executed successfully/.....");
		SpringApplication.run(SpringbootJenkinsApplication.class, args);
	}

}
