package com.ristorante.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ristorante.interfacesDAO.MenuDAO;
import com.ristorante.interfacesDAO.impl.MenuDAOimpl;
import com.ristorante.model.MenuModel;

/**
 * Servlet implementation class menuController
 */
@WebServlet("/menuController")
public class menuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public menuController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(true);
		int idRistorante=Integer.parseInt(request.getParameter("id"));		
		if(session.getAttribute("username")==null)
		{
			response.sendRedirect("login.jsp");
		}
		
		MenuDAO menuDAO= new MenuDAOimpl(); 
		ArrayList<MenuModel> listaMenu=menuDAO.getAllMenu(idRistorante);
		session.setAttribute("listaMenu",listaMenu);
		response.sendRedirect("menu.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
