package com.liangck.feign.consumer.web;

import com.liangck.feign.consumer.clients.FeignComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liangck on 2017-01-15.
 */
@RestController
@RequestMapping("/compute")
public class ConsumerController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private FeignComputeClient computeClient;

    @RequestMapping(value = "/add")
    public Integer add(@RequestParam int a, @RequestParam int b) {
//        return restTemplate.getForObject("http://compute-service/compute/add?a={a}&b={b}", String.class, a, b);
        return computeClient.add(a, b);
    }

}
