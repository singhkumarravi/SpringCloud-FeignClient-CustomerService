package com.olive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class SpringCloudLbcProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLbcProductServiceApplication.class, args);
	}

}
