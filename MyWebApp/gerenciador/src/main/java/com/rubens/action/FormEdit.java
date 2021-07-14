package com.rubens.action;

import com.rubens.modelo.Banco;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FormEdit implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Conexão banco de dados
        Banco b = new Banco();

        int empresaId = Integer.parseInt(request.getParameter("empresaId"));
        request.setAttribute("empresa", b.findEmpresaById(empresaId));

        return "forward:formEdit.jsp";
    }
}
