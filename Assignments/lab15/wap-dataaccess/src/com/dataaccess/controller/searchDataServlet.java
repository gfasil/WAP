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
 * Servlet implementation class searchDataServlet
 */
@WebServlet("/searchDataServlet")
public class searchDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	customerDao dataaccess=new customerDao();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String input=request.getParameter("input");
			// TODO Auto-generated method stub
			List<customer> list=dataaccess.searchCustomers(input);
			
			request.setAttribute("custlist", list);
			
			RequestDispatcher view=request.getRequestDispatcher("customerlist.jsp");
			view.forward(request, response);
	}

}
