package com.example.web.api.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

/**
 * WebFilter配合 @ServletComponentScan.使用
 * 默认WebFilter的urlPatterns参数"/*"
 */
@WebFilter(urlPatterns = "/*",filterName="DemoFilter")
public class DemoFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info(this.getClass().getSimpleName() + ":初始化!");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info(this.getClass().getSimpleName() + ":doFilter");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        logger.info(this.getClass().getSimpleName() + ":destroy");
    }
}
