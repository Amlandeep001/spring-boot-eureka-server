package com.abc.product.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author amlandeep.nandi
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class ProductServerApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(ProductServerApplication.class, args);
	}
}
