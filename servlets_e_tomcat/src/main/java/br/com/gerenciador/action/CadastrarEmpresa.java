package br.com.gerenciador.action;

import br.com.gerenciador.modelo.Banco;
import br.com.gerenciador.modelo.Empresa;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CadastrarEmpresa implements Action {

    /**
     * Esse método é responsável por instanciar um novo objeto Empresa e adicionar
     * ao "banco de dados" que seria a lista estática da classe Banco.
     *
     * @param response
     * @param request
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Banco de dados
        Banco banco = new Banco(); // Emulando banco de dados

        /**
         * Obtendo parâmetros de formNovaEmpresa.jsp Instanciando objeto Empresa com os
         * parâmetros obtidos na requisição.
         *
         * @param paramNomeEmpresa Será o primeiro argumento, o nome.
         * @param paramCnpj        Será o segundo argumento, o CNPJ.
         * @param paramDate        Será o terceiro argumento a data de abertura do
         *                         cadastro passado como String.
         */
        String paramNomeEmpresa = request.getParameter("nomeEmpresa");
        String paramCnpj = request.getParameter("cnpj");
        String paramDate = request.getParameter("date");
        Empresa empresa = new Empresa(paramNomeEmpresa, paramCnpj, paramDate);
        banco.adiciona(empresa);// Submetendo alterações ao "Banco de dados".

        /**
         * Definindo atributo como referência para empresa a pouco instanciada, isso
         * acontece para que suas informações de cadastro sejam exibidas pelo método
         * showList da classe ListarEmpresas.
         *
         * @method showList Responsável por chamar listarEmpresas.jsp
         */
        request.setAttribute("empresa", banco.findEmpresaById(empresa.getId()));
        ListarEmpresas le = new ListarEmpresas();

//		return le.showList(request, response); //CASE 1: tem problema de registro duplicado quando client recarrega a página (F5)
        return "redirect:ListarEmpresas";
    }
}
