<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
 <% 
        	if(request.getAttribute("hitcount") == null){
        		request.setAttribute("hitcount","");
        	}
        		
        %>
 <footer>
 <a  style="border-left:1px solid white; opacity: 0.7;"class="nav-link" href="#">total hit count for this page:<%= request.getAttribute("hitcount") %></a>
 <a  style="border-left:1px solid white; opacity: 0.7;"class="nav-link" href="#">total hit count for the WebApp:<%=  request.getServletContext().getAttribute("totalhitcount") %></a>
 
 
 </footer> 
</html>