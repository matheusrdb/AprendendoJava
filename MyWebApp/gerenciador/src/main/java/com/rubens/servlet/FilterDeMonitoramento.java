package com.rubens.servlet;

import javax.servlet.*;
import java.io.IOException;

//@WebFilter(urlPatterns = "/")
public class FilterDeMonitoramento implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Monitoramento");

        long ini = System.currentTimeMillis();

        chain.doFilter(request, response);

        long end = System.currentTimeMillis();

        System.out.println("Action:" + request.getParameter("action") + ", Tempo de execução: " + (end - ini));
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }

}
