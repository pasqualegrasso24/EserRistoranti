package com.ristorante.login;

import java.awt.event.WindowStateListener;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ristorante.interfacesDAO.UserDAO;
import com.ristorante.interfacesDAO.impl.RistoranteDAOimpl;
import com.ristorante.interfacesDAO.impl.UserDAOimpl;
import com.ristorante.model.UserModel;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession(true);
		String username=request.getParameter("user");
		String password=request.getParameter("password");
		UserDAO userDAO=new UserDAOimpl();
		UserModel userModel=userDAO.getUser(username);
	
		if(username.equals(userModel.getUsername())&&password.equals(userModel.getPassword())){		
			RistoranteDAOimpl rist= new RistoranteDAOimpl();
			session.setAttribute("ristoranti",rist);
			session.setAttribute("username",username);		
			response.sendRedirect("index.jsp");			
		}
		else{
			session.setAttribute("error","error");
			response.sendRedirect("login.jsp");
		}
		
	}

}
