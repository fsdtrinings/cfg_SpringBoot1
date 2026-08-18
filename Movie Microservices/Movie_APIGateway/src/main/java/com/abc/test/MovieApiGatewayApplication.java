package com.abc.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@EnableEurekaClient  : No Need in Spring 4.0.X onwards
@SpringBootApplication
public class MovieApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieApiGatewayApplication.class, args);
	}

}
