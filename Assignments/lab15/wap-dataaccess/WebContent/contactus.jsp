<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <!-- Font Awesome -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
<link href="https://fonts.googleapis.com/css?family=Yeon+Sung&display=swap" rel="stylesheet">
<!-- Bootstrap core CSS -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<!-- Material Design Bootstrap -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.10/css/mdb.min.css" rel="stylesheet">
<link rel="stylesheet" href="../lab4/css/style1.css">
</head>
<c:if test="${msg==null}">
        	<c:set scope="request" var="msg" value=""/> 
        </c:if>
<body>
<jsp:include page="header.html"></jsp:include> 
 
 <div class="container col-4">
       
     <div class="mainsection">
      <h2 style="font-family: 'Yeon Sung', cursive">Customer Contact Form</h2>
        <div>
       		 <p style="color:red"> ${msg}</p>
       
        </div>
          <form action="validateServlet"  method="post">
          
            <div class="form-group">
                <label for="exampleInputEmail1">*Name</label>
                <input type="text" class="form-control" name="name" aria-describedby="emailHelp" value="${userval.name}" >
              
              </div>
              <div class="form-group">
                  <label for="exampleInputEmail1">*Gender</label>
              <div class="form-check">
                <input class="form-check-input" type="radio" name="gender" id="exampleRadios1" value="male" checked>
                <label class="form-check-label" for="exampleRadios1">
                  male
                </label>
              </div>
              <div class="form-check">
                <input class="form-check-input" type="radio" name="gender" id="exampleRadios2" value="female">
                <label class="form-check-label" for="exampleRadios2">
                  female
                </label>
              </div>
              </div>
              <div class="form-group">
                <label for="exampleInputEmail1">*Category</label>
                <select class="custom-select" name="category" id="inputGroupSelect01">
                
                    <option value="" selected>Choose option</option>
                    <option value="feedback">Feedback</option>
                    <option value="inquiry">Inquiry</option>
                    <option value="complaint">Complaint</option>
                </select>
               </div>
              <div class="form-group">
                <textarea id="materialContactFormMessage"
                class="form-control md-textarea" rows="3" name="msg">${userval.message}</textarea>
              <label for="materialContactFormMessage">*Message</label>
               </div>
   
              <button type="submit" class="btn btn-outline-info waves-effect">Submit</button>
              <button type="button" class="btn btn-outline-warning btn-rounded waves-effect">cancel</button>
              
          </form>
        
        </div>
        
  </div>
  
  <jsp:include page="myFooter.jsp"></jsp:include> 
  </body>
</html>