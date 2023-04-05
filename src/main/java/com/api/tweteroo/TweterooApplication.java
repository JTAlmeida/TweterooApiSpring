package com.api.tweteroo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TweterooApplication {

	public static void main(String[] args) {
		// SpringApplication.run(TweterooApplication.class, args);

		// Below code is used for local test on non-default port
		SpringApplication app = new SpringApplication(TweterooApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "5000"));
		app.run(args);

	}

}
