package com.dataaccess.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dataaccess.AccessDao.customerDao;
import com.dataaccess.model.customer;

/**
 * Servlet implementation class InsertDataServlet
 */
@WebServlet(name="InsertDataServlet", urlPatterns= {"/insert-customer-data"})
public class InsertDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	customer cust1=null;
	customerDao dataaccess=new customerDao();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name= request.getParameter("name");
		String message=request.getParameter("msg");
		String category= request.getParameter("category");
		String gender=request.getParameter("gender");
		cust1=new customer(name,gender,category,message);
		int result=dataaccess.insertdata(cust1);
		
		if(result<=0)

		{
			response.sendRedirect("index.jsp");
		}
		else {
			request.setAttribute("customerdata", cust1);
			RequestDispatcher view = request.getRequestDispatcher("thankyou.jsp"); 
			view.forward(request, response);
		
		}
	}

}
