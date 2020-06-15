package com.javarevolutions.jsps.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javarevolutions.jsps.servlets.vo.VOLogin;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginWeb.jr")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		System.out.println("USUARIO : "+  usuario);
		System.out.println("PASSWORD : "+ password);
		if(usuario.equals("juan") &&  password.equals("villa")) {
			VOLogin vo = new VOLogin();
			vo.setUsuario(usuario);
			vo.setPassword(password);
			vo.setEdad(18);
			vo.setNombre("Jose  Villalobos");
			HttpSession session  = request.getSession(true);
			session.setAttribute("usuariologeado", vo);
			request.getRequestDispatcher("welcome.jsp").forward(request,response);
		}else {
			System.out.println("NO ERES JUAN");
			System.out.println("----------------------------------");
			response.sendRedirect("login.html");
		}
		
	}

}
