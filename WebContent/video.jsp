<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Videos</title>
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
<iframe width="560" height="315" src="https://www.youtube-nocookie.com/embed/iK_lwEDHYZ0" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe></body>
</html>