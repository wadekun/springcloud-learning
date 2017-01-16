package com.liangck.hystrix.consumer.web;

import com.liangck.hystrix.consumer.service.ComputeConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liangck on 2017-01-16.
 */
@RestController
@RequestMapping(value = "/compute")
public class ConsumerContrller {

    @Autowired
    private ComputeConsumerService consumerService;

    @RequestMapping(value = "/add", method = {RequestMethod.GET})
    public int add(@RequestParam int a, @RequestParam int b) {
        return consumerService.add(a, b);
    }
}
