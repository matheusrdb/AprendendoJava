package br.com.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = "/listEmpresas")
public class ListaEmpresasServleta {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		
		PrintWriter out = response.getWriter();
		out.println("<html><meta CHARSET = UTF-8><body><ul>");
		
		for(int i = 0; i < banco.getEmpresas().size(); i++) {
			out.println("<li>" + banco.getEmpresas().get(i).getName() + "</li>");
		}
		
		out.println("</ul></body></html>");
	}
}
