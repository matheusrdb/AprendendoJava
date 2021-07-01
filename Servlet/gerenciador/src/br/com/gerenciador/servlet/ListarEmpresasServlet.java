package br.com.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListarEmpresasServlet
 */
@WebServlet(urlPatterns="/listarEmpresas")
public class ListarEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Empresa> listaEmpresa = banco.getEmpresas();
		
		//Encaminha lista pro JSP
		RequestDispatcher rd = request.getRequestDispatcher("/listarEmpresas.jsp");
		request.setAttribute("listaEmpresa", listaEmpresa);
		
		rd.forward(request, response);
	}

}
