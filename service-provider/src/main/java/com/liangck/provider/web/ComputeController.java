package com.liangck.provider.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 计算服务接口
 *
 * Created by liangck on 2017-01-15.
 */
@RestController
@RequestMapping(value = "/compute")
public class ComputeController {

    /**
     * 加法服务
     * @param a
     * @param b
     * @return
     */
    @RequestMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

}
