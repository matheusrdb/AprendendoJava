package br.com.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = "/newEmpresa")
public class NovaEmpresaServleta extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa...");
		String nomeEmpresa = request.getParameter("nome");
		
		Empresa empresa = new Empresa(nomeEmpresa);
		System.out.println(empresa.getName());
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>Funciona?</h1> </body></html>");
		
		//Chamar JSP
		request.getRequestDispatcher("/novaEmpresaCriada.jsp");
	}
}
