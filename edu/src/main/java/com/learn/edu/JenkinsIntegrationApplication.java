package com.learn.edu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsIntegrationApplication {


	public static Logger logger = LoggerFactory.getLogger(JenkinsIntegrationApplication.class);
	@PostConstruct
	public void innt()
	{
		logger.info("Hello Yuuuu");
		logger.info("Hello Yuuuu");
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsIntegrationApplication.class, args);
	}

}
