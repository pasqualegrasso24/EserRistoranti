package com.ristorante.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ristorante.interfacesDAO.PiattoDAO;
import com.ristorante.interfacesDAO.impl.PiattoDAOimpl;
import com.ristorante.model.PiattoModel;

/**
 * Servlet implementation class piattoController
 */
@WebServlet("/piattoController")
public class piattoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public piattoController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		int idMenu = Integer.parseInt(request.getParameter("id"));
		if (session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		}

		PiattoDAO piattoDAO = new PiattoDAOimpl();
		ArrayList<PiattoModel> listaPiatto = piattoDAO.getAllPiatto(idMenu);
		try{
		if (listaPiatto.get(0) != null) {
			
		
			session.setAttribute("listaPiatti", listaPiatto);
			response.sendRedirect("piatti.jsp");}
		}catch(IndexOutOfBoundsException e){
			response.sendRedirect("errore.html");
		}

	}

}
