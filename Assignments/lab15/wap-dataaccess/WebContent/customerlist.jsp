<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
<link href="https://fonts.googleapis.com/css?family=Yeon+Sung&display=swap" rel="stylesheet">
<!-- Bootstrap core CSS -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<!-- Material Design Bootstrap -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.10/css/mdb.min.css" rel="stylesheet">
</head>
<body>
<jsp:include page="header.html"></jsp:include> 
<div class="container col-4">
 <h2 style="font-family: 'Yeon Sung', cursive">Customer Feedback List</h2>
<table class="table table-striped">
<thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">First Name</th>
      <th scope="col">Gender</th>
      <th scope="col">Category</th>
       <th scope="col">Message</th>
    </tr>
  </thead>
  <tbody>
<c:forEach var="contactData" items="${custlist}" varStatus="iteration">
	 <tr>
	 				 	<th scope="row"><c:out value="${iteration.index+1}"></c:out></th>
	 				 	<td><c:out value="${contactData.fname}"></c:out></td>
                        <td><c:out value="${contactData.gender}"></c:out></td>
                        <td><c:out value="${contactData.category}"></c:out></td>
                        <td><c:out value="${contactData.message}"></c:out></td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
	 
       </tr>
</c:forEach>
</tbody>
</table>


</div>
</body>
</html>