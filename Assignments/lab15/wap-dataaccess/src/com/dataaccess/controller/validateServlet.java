package com.dataaccess.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class validateServlet
 */
@WebServlet(name="validateServlet", urlPatterns= {"/validateServlet"})
public class validateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private int hitcount=0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		hitcount=1;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @param response 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected StringBuilder  validate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		String name= request.getParameter("name");
		String message=request.getParameter("msg");
			String category= request.getParameter("category");
	String gender=request.getParameter("gender");
		Map<String,String> fields=new HashMap<>();
		
		
		
		fields.put("name", name);
		fields.put("message",message);
		fields.put("category", category);
		fields.put("gender",gender);
		
			StringBuilder missing=new StringBuilder("");
			Set<String>  keys=fields.keySet();
			
			
		for(String i:keys) {
			
			if(fields.get(i).equals("")||fields.get(i).equals(null)) {
				missing.append(System.getProperty("line.separator"));
				missing.append(i + " is missing");
				request.setAttribute("userval" ,fields);
			}
			else {
				HttpSession session=request.getSession();
				session.setAttribute(i  ,": "+fields.get(i));
				
				request.setAttribute(i  ,": "+fields.get(i));
			}
		
			
			
		}
		
		return  missing;
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			request.setAttribute("hitcount", hitcount);
			hitcount++;
			request.setAttribute("now", new java.util.Date());
			StringBuilder missing=validate(request,response);
			if(missing.length()!=0) {
				
				request.setAttribute("msg", missing);
				RequestDispatcher view = request.getRequestDispatcher("contactus.jsp"); 
				view.forward(request, response);
			}
				RequestDispatcher view = request.getRequestDispatcher("/insert-customer-data"); 
				view.forward(request, response);
			
				
		
			
			

			
	}

}
