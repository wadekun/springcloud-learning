package com.liangck.api.gateway;

import com.liangck.api.gateway.filter.AccessFilter;
import com.liangck.api.gateway.filter.IllegalArgFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

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

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }

    @Bean
    public IllegalArgFilter illegalArgFilter() {
        return new IllegalArgFilter();
    }
}
