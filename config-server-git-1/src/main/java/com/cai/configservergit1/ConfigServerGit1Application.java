package com.cai.configservergit1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerGit1Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerGit1Application.class, args);
	}
}
