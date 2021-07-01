package br.com.gerenciador.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import com.sun.source.tree.WhileLoopTree;

/**
 * Servlet implementation class editEmpresaServlet
 */
@WebServlet("/editEmpresa")
public class editEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Variável para remoção de objetos do "Banco de dados".
	 */
	private Empresa deletedEmpresa;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/**
		 * Instanciando obj que representa um banco de dados.
		 */
		Banco banco = new Banco();
		List<Empresa> empresas = banco.getEmpresas();

		/**
		 * Atribuindo parâmetros recebidos de listarEmpresas.jsp
		 * 
		 * @param empresaId
		 * @param willDelete Este parâmetro verifica se irá ser uma exclusão.
		 */
		Integer empresaId = Integer.parseInt(request.getParameter("empresaId"));
		Boolean willDelete = Boolean.valueOf(request.getParameter("willDelete"));

		/**
		 * Verifica se willDelete é true para determinar se irá excluir um registro ou
		 * apenas editar.
		 */
		if (willDelete == true) {
			/**
			 * O laço de repetição verifica o Id de cada objeto da lista para identificar
			 * qual objeto irá ser excluído, e atribui a referência deste objeto ao field
			 * deletedEmpresa.
			 * 
			 * O objeto não irá ser excluído dentro do laço pois isso ocasiona em uma
			 * ConcurrentModificationException na stack de execução.
			 */
			for (Empresa empresa : empresas) {
				if (empresa.getId() == empresaId) {
					this.deletedEmpresa = empresa;
				}
			}
			/**
			 * Redirecionamento client-side e remoção do objeto do "Banco de Dados".
			 */
			banco.deleteEmpresa(deletedEmpresa);
			response.sendRedirect("/gerenciador/listarEmpresas");
		} else {
			/**
			 * Redirecionamento server-side para editEmpresa.jsp junto ao Id da empresa que
			 * irá ser editada.
			 * 
			 * @param empresaId
			 */
			RequestDispatcher rd = request.getRequestDispatcher("/editEmpresa.jsp");
			request.setAttribute("empresaId", empresaId);
			rd.forward(request, response);
		}
	}
}
