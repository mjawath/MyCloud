package com.example.demogateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class DemogatewayApplication {


//	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {

		//@formatter:off
		return builder.routes()
				.route("path_route", r -> r.path("/get")
						.uri("https://httpbin.org:85"))

//				.route(r -> r.path("/gtest/**").and().predicate()
//						.filters(f -> f.addRequestHeader("Hello", "World"))
//						.uri("lb://gwtest"))
//				.predicate(gf.apply(new Config(true, "customerId"))))
				.build();
		//@formatter:on
	}
//	https://stackoverflow.com/questions/48865174/spring-cloud-gateway-proxy-forward-the-entire-sub-part-of-url
//	https://piotrminkowski.com/2019/11/06/microservices-with-spring-boot-spring-cloud-gateway-and-consul-cluster/
	public static void main(String[] args) {
		SpringApplication.run(DemogatewayApplication.class, args);
	}
}
