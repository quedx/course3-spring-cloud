package com.quedx.course3springconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Course3SpringConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Course3SpringConfigServerApplication.class, args);
	}

}
