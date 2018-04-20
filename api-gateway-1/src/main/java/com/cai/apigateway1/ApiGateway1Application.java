package com.cai.apigateway1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ApiGateway1Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiGateway1Application.class, args);
	}
}
