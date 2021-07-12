package br.com.gerenciador.servlet;

/**
 * Esse servlet é o controlador, o parâmetro action define de qual classe o
 * método execute será executado.
 *
 * @author mrrobot
 */
//@WebServlet(urlPatterns = "/")
//public class ControladorServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    /**
//     * @param request request
//     * @param response response
//     * @throws ServletException exception
//     * @throws IOException exception
//     */
//    protected void service(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        request.setCharacterEncoding("UTF-8");
//
//        //Vars
//        String paramAction = request.getParameter("action");
//        Class classe;
//        Action action;
//
//        try {
//            classe = Class.forName("br.com.gerenciador.action." + paramAction);
//            action = (Action) classe.newInstance();
//        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
//            System.out.println("Parameter (action) is invalid!");
//            throw new ServletException(e);
//        }
//
//        String destination = action.execute(request, response);
//        String[] typeAddress = destination.split(":");
//        if (typeAddress[0].equals("forward")) {
//            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + typeAddress[1]);
//            rd.forward(request, response);
//        } else {
//            response.sendRedirect("?action=" + typeAddress[1]);
//        }
//
//
//    }
//
//}
