package br.com.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.action.Action;

/**
 * Esse servlet é o controlador, o parâmetro action define de qual classe o
 * método execute será executado.
 * 
 * @author mrrobot
 *
 */
@WebServlet(value = "/entrada")
public class entradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");// Evita problema de encoding

		/**
		 * Instancia uma classe Action de acordo com o parâmetro action da requisição.
		 * 
		 * @param action Parâmetro da requisição que define a classe do objeto classe.
		 * @obj classe Define a classe Action que será usada de acordo com action.
		 * @obj action Executa o método execute(request, response) implementado.
		 */
		Class classe = null;
		Action action = null;
		try {
			classe = Class.forName("br.com.gerenciador.action." + request.getParameter("action"));
			action = (Action) classe.newInstance();
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
			System.out.println("Parameter (action) is invalid!");
			throw new ServletException(e);
		}

		/**
		 * O método execute de cada classe Action tem implementações diferentes, mas
		 * todos retornam um destino em formato de String.
		 * 
		 * @String destination String com o destino final da requsição e/ou resposta.
		 * @method execute Returns a destination
		 */
		String destination = action.execute(request, response);

		/**
		 * 
		 * @String typeAddress recebe um array com duas posições, a typeAddress[0] ->
		 *         forward or redirect, e typeAddress[1] -> address.
		 */
		if (destination != null) {
			String[] typeAddress = destination.split(":");
			if (typeAddress[0].equals("forward")) {
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + typeAddress[1]);
				rd.forward(request, response);
			} else {
				response.sendRedirect(typeAddress[1]);
			}
		} else {
			throw new NullPointerException("Destination is null!");
		}

	}

}
