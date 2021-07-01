package br.com.gerenciador.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.DateFormatter;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet(urlPatterns="/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		/**
		 * Obtendo parâmetros de formNovaEmpresa.jsp
		 */
		String paramNomeEmpresa = request.getParameter("nomeEmpresa");
		String paramCnpj = request.getParameter("cnpj");
		
		/**
		 * Instanciando objeto Empresa com os parâmetros obtidos na requisição.
		 */
		Empresa empresa = new Empresa(paramNomeEmpresa, paramCnpj);
		
		/**
		 * Convertendo String dataAbertura para Date
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		/**
		 * Atribuindo data de abertura com try pois método parse() tem exception unchecked.
		 */
		String paramDataEmpresa = request.getParameter("date");
		Date dataAbertura = null;
		try {	
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch(ParseException ex) {
			throw new ServletException(ex);
		}
		empresa.setDataAbertura(dataAbertura);
	
		/**
		 * Chama o JSP, com a mensagem que a empresa foi cadastrada e na requisição HTTP 
		 * define os atributos: nomeEmpresa, cnpj e date. Tais atributos são obtidos através 
		 * dos métodos do objeto Empresa.
		 */
		RequestDispatcher rd = request.getRequestDispatcher("/listarEmpresas");
		request.setAttribute("nomeEmpresa", empresa.getNome());
		request.setAttribute("cnpj", empresa.getCnpj());
		request.setAttribute("dataAbertura", empresa.getDataAbertura());
		
		
		/**
		 * Simulando adição da empresa ao Banco de dados
		 */
		banco.adiciona(empresa);
		response.sendRedirect("/gerenciador/listarEmpresas");
	}

}
