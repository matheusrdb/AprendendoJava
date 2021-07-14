package com.rubens.action;

import com.rubens.modelo.Banco;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RemoveEmpresas implements Action {

    /**
     * Responsável por remover um objeto Empresa do "Banco de dados".
     *
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // Banco de dados
        Banco banco = new Banco();

        /**
         * @param empresaId Identifica a empresa que será removida ou modificada.
         */
        int empresaId = Integer.parseInt(request.getParameter("empresaId"));
        banco.deleteEmpresa(empresaId);

        /**
         * @method showList Responsável por chamar listarEmpresas.jsp
         * @param msg Boolean
         */
        request.setAttribute("msg", true);

        ListarEmpresas le = new ListarEmpresas();
        return le.execute(request, response);

    }
}
