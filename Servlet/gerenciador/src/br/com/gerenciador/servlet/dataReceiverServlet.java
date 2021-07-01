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
 * Servlet implementation class dataReceiverServlet
 */
@WebServlet("/dataReceiver")
public class dataReceiverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Banco banco = new Banco();
		List<Empresa> empresas = banco.getEmpresas();

		String paramStringId = request.getParameter("empresaId");
		String paramNewName = request.getParameter("paramNewName");
		String paramNewCnpj = request.getParameter("paramNewCnpj");

		Integer empresaId = Integer.parseInt(paramStringId);

		for (Empresa empresa : empresas) {
			if (empresa.getId() == empresaId) {
				empresa.setName(paramNewName);
				empresa.setCnpj(paramNewCnpj);
				RequestDispatcher rd = request.getRequestDispatcher("/listarEmpresas");
				request.setAttribute("nomeEmpresa", empresa.getNome());
				request.setAttribute("cnpj", empresa.getCnpj());
				request.setAttribute("dataAbertura", empresa.getDataAbertura());
				rd.forward(request, response);
			}
		}

	}
}
