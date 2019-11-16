package com.dataaccess.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dataaccess.AccessDao.customerDao;
import com.dataaccess.model.customer;

/**
 * Servlet implementation class ListAllDataServlet
 */
@WebServlet(name="listdata", urlPatterns={ "/ListAllDataServlet", "/customer-list" })
public class ListAllDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	customerDao dataaccess=new customerDao();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String input=request.getParameter("input");
		List<customer> custlist=dataaccess.searchCustomers(input);
//		request.setAttribute("custlist", custlist);
//		
//		RequestDispatcher view=request.getRequestDispatcher("customerlist.jsp");
//		view.forward(request, response);
		request.setAttribute("custlist", custlist);
		
		RequestDispatcher view=request.getRequestDispatcher("customerlist.jsp");
		view.forward(request, response);
	}

}
