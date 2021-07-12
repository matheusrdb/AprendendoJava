package br.com.gerenciador.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebFilter(urlPatterns = "/")
public class FilterAuthentication implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest genericRequest, ServletResponse genericResponse, FilterChain chain) throws IOException, ServletException {
        System.out.println("Authentication");

        HttpServletRequest request = (HttpServletRequest) genericRequest;
        HttpServletResponse response = (HttpServletResponse) genericResponse;
        request.setCharacterEncoding("UTF-8");

        //Verifica se o padrão Action é null
        String paramAction = request.getParameter("action");
        if (paramAction == null) {
            response.sendRedirect("?action=FormLogin");
            return;
        }

        //Verifica se o usuário está logado
        HttpSession cookie = request.getSession();
        boolean noLoggedUser = cookie.getAttribute("loggedUser") == null;
        boolean freeAction = !(paramAction.equals("Login") || paramAction.equals("FormLogin"));
        if (noLoggedUser && freeAction) {
            response.sendRedirect("?action=FormLogin");
            return;
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
}
