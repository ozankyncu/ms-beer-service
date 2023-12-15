package com.kyncu.beersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsBeerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBeerServiceApplication.class, args);
	}

}
