package io.agilehandy.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CatalogDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogDataServiceApplication.class, args);
	}
}
