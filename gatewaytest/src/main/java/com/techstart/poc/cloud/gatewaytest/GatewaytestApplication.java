package com.techstart.poc.cloud.gatewaytest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping("/employee")
public class GatewaytestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewaytestApplication.class, args);
	}


	@RequestMapping("/hello")
	public String get(@RequestParam(required = false)String msg){
		return " hello "+ msg;
	}

}
