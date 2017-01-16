package com.liangck.hystrix.consumer.service;

import com.liangck.hystrix.consumer.client.FeignComputeClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liangck on 2017-01-16.
 */
@Service
public class ComputeConsumerService {

    @Autowired
    private FeignComputeClient computeClient;

    @HystrixCommand(fallbackMethod = "invokeServiceError")
    public int add(int a, int b) {
        return computeClient.add(a, b);
    }

    // 这里 方法签名，返回值 要与 add 一致
    private int invokeServiceError(int a, int b) {
        return -1;
    }
}
