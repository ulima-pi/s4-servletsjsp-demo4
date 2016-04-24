package pe.edu.ulima.vetguide;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendError(405);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("username");
		String password = request.getParameter("password");

		if (usuario.equals("pi") && password.equals("123")) {
			request.getSession().setAttribute("usuario", usuario);

			RequestDispatcher rd = request.getRequestDispatcher("exito.jsp");
			request.setAttribute("usuario", usuario);
			request.setAttribute("metodo", "POST");
			rd.forward(request, response);

		} else {
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			request.setAttribute("metodo", "POST");
			rd.forward(request, response);
		}


	}

}
