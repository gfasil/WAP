<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<c:if test="{hitcount==null}">
	<c:set var="hitcount" scope="request" value=""/>
</c:if>

 <footer>
 <a  style="border-left:1px solid white; opacity: 0.7;"class="nav-link" href="#">total hit count for this page: ${hitcount}</a>
 <a  style="border-left:1px solid white; opacity: 0.7;"class="nav-link" href="#">total hit count for the WebApp:${totalhitcount}</a>
 
 
 </footer> 
</html>