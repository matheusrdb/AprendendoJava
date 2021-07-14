package com.rubens.action;

import com.rubens.modelo.Banco;
import com.rubens.modelo.Empresa;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditEmpresa implements Action {

    /**
     * Este método é responsável por realizar as modificações no objeto e submeter
     * as inforamações ao "Banco de dados".
     *
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Banco banco = new Banco(); // Banco de dados
        /**
         * Parâmetros obtidos de editEmpresa.jsp
         *
         * @param empresaId É necessário pra identificar o objeto.
         * @param newName   Será o novo nome da empresa.
         * @param newCnpj   Será o novo CNPJ da empresa.
         */
        int empresaId = Integer.parseInt(request.getParameter("empresaId"));
        String newName = request.getParameter("paramNewName");
        String newCnpj = request.getParameter("paramNewCnpj");

        /**
         * @obj empresa É responsável por passar os parâmetros nomeEmpresa, cnpj e
         *      dataAbertura
         */
        try {
            banco.editaEmpresa(empresaId, newName, newCnpj);
        } catch (NullPointerException ex) {
            throw new NullPointerException("empresaId NULO, verifique os parâmetros!");
        }

        /**
         * Inserindo atributos na requisição.
         */
        Empresa empresa = banco.findEmpresaById(empresaId);
        request.setAttribute("empresa", empresa);

        /**
         * @param edited Para identificar se foi uma edição, caso não seja, é mostrada
         *               uma mensagem de cadastro e não de edição.
         */
        request.setAttribute("edited", true);

        /**
         * @method showList Responsável por chamar listarEmpresas.jsp
         */
        ListarEmpresas le = new ListarEmpresas();
        return le.execute(request, response);
    }
}
