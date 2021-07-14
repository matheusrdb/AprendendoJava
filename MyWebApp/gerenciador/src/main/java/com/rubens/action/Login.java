package com.rubens.action;

import com.rubens.modelo.Banco;
import com.rubens.modelo.Usuario;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Login implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String receivedLogin = request.getParameter("login");
        String receivedPassword = request.getParameter("password");

        Banco banco = new Banco();
        Usuario usuario = banco.getUsuario(receivedLogin, receivedPassword);

        if (usuario != null) {
            HttpSession session = request.getSession();
            session.setAttribute("loggedUser", usuario);
            return "redirect:Home";
        } else {
            request.setAttribute("loginInvalido", true);
            return "forward:formLogin.jsp";
        }
    }
}
