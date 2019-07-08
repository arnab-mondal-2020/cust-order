package com.amdocs.custorder.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.amdocs.*")
public class CustOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustOrderApplication.class, args);
	}

}
