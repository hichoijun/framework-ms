package com.cai.eurekaconsumerfeign1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerFeign1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerFeign1Application.class, args);
	}
}
