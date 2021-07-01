package br.com.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/OlaMundo")
public class OlaMundoServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws IOException {
		
		PrintWriter out = arg1.getWriter();
		out.println("<html>");
		out.println("<meta charset = UTF-8>");
		out.println("<body>");
		out.println("Olá Mundo! PROGRAMEI MEU PRIMEIRO SERVLET!");
		out.println("</body>");
		out.println("</html>");
	}
}
