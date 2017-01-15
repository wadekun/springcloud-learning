package com.liangck.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by liangck on 2017-01-15.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {
//        SpringApplication.run(ProviderApplication.class, args);
        new SpringApplicationBuilder(ProviderApplication.class).web(true).run(args);
    }

}
