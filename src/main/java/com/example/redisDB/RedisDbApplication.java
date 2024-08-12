package com.example.redisDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.redisDB.RedisConfig"})
public class RedisDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisDbApplication.class, args);
	}

}
