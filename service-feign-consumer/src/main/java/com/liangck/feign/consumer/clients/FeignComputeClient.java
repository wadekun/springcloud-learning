package com.liangck.feign.consumer.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by liangck on 2017-01-15.
 */
@FeignClient("compute-service")
public interface FeignComputeClient {

    @RequestMapping(value = "/compute/add", method = RequestMethod.GET)
    int add(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b);

}
