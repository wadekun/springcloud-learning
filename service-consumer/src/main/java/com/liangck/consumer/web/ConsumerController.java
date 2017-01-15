package com.liangck.consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by liangck on 2017-01-15.
 */
@RestController
@RequestMapping("/compute")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return restTemplate.getForObject("http://compute-service/compute/add?a={a}&b={b}", String.class, a, b);
    }

}
