package com.lab11.MyApp11.web;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class CounterFilter
 */

// if you wanna do filter or the servlet only then you can user urlpattern of servelt but if you want all jsp and html filee to be included
@WebFilter(urlPatterns = { "","/*" }, servletNames = { "validateServlet" })
public class CounterFilter implements Filter {

    /**
     * Default constructor. 
     */
	private int hitcount=0;
    public CounterFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		hitcount++;
			ServletContext context=request.getServletContext();
		context.setAttribute("totalhitcount", this.hitcount);
		
		
		System.out.println(hitcount);
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
