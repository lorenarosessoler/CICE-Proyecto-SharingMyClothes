package com.cice.lrs.smceurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SmcEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmcEurekaServerApplication.class, args);
	}
}
