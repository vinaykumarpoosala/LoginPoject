<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>

<head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Vinay</title>
        <meta name="description" content="An interactive getting started guide for Brackets.">
        <link rel="stylesheet" href="style.css">
    
</head>
<body>
 
<%

if(session.getAttribute("uname")==null)
{
	response.sendRedirect("Login.jsp");
}
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
%>
<C:import url="Static.html"></C:import>
<div class="heading1" >
<h1 style="align:center; float:none;">welcome ${uname} ${rs} </h1>
</div>
<form action="SubmitPost" method="post">
	<h2>post something here</h2>
	<br>
	Title <input type="text" name="title" size="60">
	<br>
	text
	<br>
	<textarea name="paragraph_text" cols="50" rows="10"></textarea>
	<br>
	<input type="submit" value ="post">
</form>
<sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/vinay"
        user="root" password="vinay@123"
    />
 <sql:query var="listUsers" dataSource="${myDS}">SELECT * FROM vinay;</sql:query>
 
 
<C:forEach var="user" items="${listUsers.rows}">
<div class="posts" style="
				width:50%;
				left:25%;
				right:25%;
				border-radius: 5px;
				background-color: #f2f2f2;
				padding: 10px;">
<h1><C:out value="${user.title}" /> </h1>  
<hr>
<br>      
<p><C:out value="${user.posts}" /><p>
</div>
<br>
<br>
</C:forEach>


</body>
</html>