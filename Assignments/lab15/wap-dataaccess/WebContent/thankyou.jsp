<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Audiowide|Yeon+Sung&display=swap" rel="stylesheet">
<style type="text/css">
.card-header{
font-family: 'Audiowide', cursive;
}
span{
font-family: 'Audiowide', cursive;
}

</style>
</head>
<body>
<jsp:include page="header.html"></jsp:include> 
<div class="container mainsection col-9"><p style="float:right"> ${now}</p></div>

<div class="container mainsection col-9">
 <div class="card bg-light mb-3 " style=" margin-top:5rem">
  <div class="card-header">Thank You! your message have been Received as follows:</div>
  <div class="card-body">
    <h5 class="card-title">Information:</h5>
    
    <p class="card-text"><span>Name</span> ${customerdata.fname}</p>
    <p class="card-text"><span>Gender</span> ${customerdata.gender}</p>
     <p class="card-text"><span>Category</span> ${customerdata.category}</p>
    <p class="card-text"><span>Message</span>${customerdata.message}</p>
  </div>
  
  <footer>feel free to <a href="contactus.jsp" style="color:#28A8EA"> contact us </a> again!</footer>
</div>
<jsp:include page="myFooter.jsp"></jsp:include> 
</div>
</body>
</html>