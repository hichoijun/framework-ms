package com.cai.turbineamqp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@EnableTurbineStream
@EnableDiscoveryClient
@SpringBootApplication
public class TurbineAmqp1Application {

	public static void main(String[] args) {
		SpringApplication.run(TurbineAmqp1Application.class, args);
	}
}
