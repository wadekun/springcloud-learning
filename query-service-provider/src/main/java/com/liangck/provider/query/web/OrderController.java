package com.liangck.provider.query.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liangck on 2017-01-19.
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String findById(@PathVariable Long id) {
        return "order" + id;
    }

}
