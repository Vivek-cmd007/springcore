package com.abc.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class MongodbdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbdemoApplication.class, args);
	}

}
