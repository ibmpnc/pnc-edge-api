package com.pnc.edge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication(scanBasePackages = {"com.pnc.edge"})
@EnableRetry
public class EdgeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeApiApplication.class, args);
	}

}

