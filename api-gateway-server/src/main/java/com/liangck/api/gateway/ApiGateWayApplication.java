package com.liangck.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by liangck on 2017-01-19.
 */
@EnableZuulProxy
@SpringCloudApplication
public class ApiGateWayApplication {

    public static void main(String[] args) {
//        SpringApplication.run(ApiGateWayApplication.class, args);
        new SpringApplicationBuilder(ApiGateWayApplication.class).web(true).run(args);
    }

}
