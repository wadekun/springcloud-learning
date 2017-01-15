package com.liangck.provider.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liangck on 2017-01-15.
 */
@RestController
@RequestMapping(value = {"", "/", "/index"})
public class IndexController {

    @RequestMapping
    public String index() {
        return "compute-service";
    }

}
