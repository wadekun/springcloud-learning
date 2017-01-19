package com.liangck.api.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by liangck on 2017-01-19.
 */
public class AccessFilter extends ZuulFilter {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccessFilter.class);

    /**
     * filter
     *
     *
     * <p>
     *     四个级别：
     *     pre -- 可以在请求被路由之前调用
     *     routing -- 在路由请求时候被调用
     *     post -- 在请求后调用
     *     error -- 请求错误时被调用
     * </p>
     *
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * filter 调用顺序: 值越小越靠前
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 该过滤器是否执行
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 真正的执行逻辑
     * @return
     */
    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        LOGGER.info("request for: {} {}", request.getRequestURI(), request.getMethod());

        String token = request.getParameter("token");

        if (StringUtils.isEmpty(token)) {
            LOGGER.warn("accessToken is empty");
            requestContext.setResponseStatusCode(401);
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseBody("illegal access");
            return null;
        }

        LOGGER.info("accessToken is ok");
        return null;
    }
}
