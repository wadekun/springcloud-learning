package com.liangck.api.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by liangck on 2017-01-19.
 */
public class IllegalArgFilter extends ZuulFilter{
    private static final Logger LOGGER = LoggerFactory.getLogger(IllegalArgFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        LOGGER.info("IllegalArgFilter running...");
        return null;
    }
}
