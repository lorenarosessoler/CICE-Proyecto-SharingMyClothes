package com.cice.lrs.smczuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@EnableZuulServer
@EnableEurekaClient
@SpringBootApplication
public class SmcZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmcZuulServerApplication.class, args);
	}
}
