package br.com.gerenciador.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.modelo.Banco;

public class FormEdit implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Conexão banco de dados
		Banco b = new Banco();

		int empresaId = Integer.parseInt(request.getParameter("empresaId"));
		request.setAttribute("empresa", b.findEmpresaById(empresaId));

		return "forward:formEdit.jsp";
	}
}
