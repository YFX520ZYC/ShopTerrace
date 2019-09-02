package com.love.shopterrace.constsys;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *    为了解决跨域的问题所建的类        也可以在Controller的方法上使用@CrossOrigin  //实现跨域
 */
@WebFilter("/*")
public class CrosFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        //设置允许跨域
        //允许跨域
        response.setHeader("Access-Control-Allow-Origin","*");
        //跨域的请求方式
        response.setHeader("Access-Control-Allow-Methods","GET,POST,PUT,DELETE");
        //允许跨域的消息头
        response.setHeader("Access-Control-Allow-Headers","Content-Type,usertoken");
        //条件跨域
        response.setHeader("Access-Control-Allow-Credentials","true");
        filterChain.doFilter(servletRequest,response);
    }

}
