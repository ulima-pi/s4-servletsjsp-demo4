package pe.edu.ulima.vetguide;

import java.io.IOException;
import java.io.PrintWriter;

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
		if (request.getSession(false) == null){
			// No existe una sesión abierta
			String usuario = request.getParameter("username");
			String password = request.getParameter("password");
			
			String respuesta = "";
			if (usuario.equals("pi") && password.equals("123")){
				request.getSession().setAttribute("usuario", usuario);
				respuesta = "<h1>Login exitoso del usuario " + usuario + "</h1>";
			}else{
				respuesta = "<h1>Error en login</h1>";
			}
			
			PrintWriter out = response.getWriter();
			out.print("<html>");
			out.print("<body>");
			out.print(respuesta);
			out.print("<div>Petición de tipo POST</div>");
			out.print("</body>");
			out.print("</html>");
		}else{
			PrintWriter out = response.getWriter();
			out.print("<html>");
			out.print("<body>");
			out.print("<h1>Ya hay una sesión iniciada con el usuario " + 
					request.getSession().getAttribute("usuario") + "</h1>");
			out.print("<div>Petición de tipo POST</div>");
			out.print("</body>");
			out.print("</html>");
		}
	}

}
