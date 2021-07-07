package br.com.gerenciador.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.modelo.Banco;
import br.com.gerenciador.modelo.Empresa;

public class ListarEmpresas implements Action {

	/**
	 * Esse método é responsável por carregar dados do "Banco de dados" e atribuos,
	 * e encaminhar para listarEmpresas.jsp
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Banco banco = new Banco();// Banco de dados

		/**
		 * Pega a referência de empresa que foi instanciado em action. Essa referência é
		 * inserida na requisição e enviada para listarEmpresas.jsp
		 * 
		 * @object Empresa
		 */
		request.setAttribute("empresa", request.getAttribute("empresa"));

		/**
		 * @param edited       Boolean
		 * @param msg          Boolean
		 * @param listaEmpresa Simula uma conexão com o banco de dados.
		 */
		request.setAttribute("listaEmpresa", banco.getEmpresas());
		request.setAttribute("msg", request.getAttribute("msg"));
		request.setAttribute("edited", request.getAttribute("edited"));

		return "forward:listarEmpresas.jsp";
	}
}
