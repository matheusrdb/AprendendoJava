package br.com.gerenciador.servlet;

import br.com.gerenciador.action.Action;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter(filterName = "ControlatorFilter")
public class ControlatorFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws ServletException, IOException {

        System.out.println("ControladorFilter");

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        request.setCharacterEncoding("UTF-8");

        //Vars
        String paramAction = request.getParameter("action");
        Class classe;
        Action action;

        try {
            classe = Class.forName("br.com.gerenciador.action." + paramAction);
            action = (Action) classe.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            System.out.println("Parameter (action) is invalid!");
            throw new ServletException(e);
        }

        String destination = action.execute(request, response);

        String[] typeAddress = destination.split(":");
        if (typeAddress[0].equals("forward")) {
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + typeAddress[1]);
            rd.forward(request, response);
        } else {
            response.sendRedirect("?action=" + typeAddress[1]);
        }

    }
}
