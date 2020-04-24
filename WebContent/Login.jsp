<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
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
 <div class="header">
 <a href="#" class="logo">Independent Ltd</a>
  <div class="header-right">
    <a  href="Welcome.jsp">Home</a>
    <a href="video.jsp">Videos</a>
    <a href="About.jsp">About</a>
    <a href="register.jsp">Register here</a>
  </div>
 </div>

<div class="rsPgae">
<form action="Login" method="post">

    <fieldset align="center">
        <h3>Login here</h3><hr>
        <br>
        <label for="userName">User name</label>
        <input type="text" name="userName">
        <br>
        <br>
        <label for="password">password</label>
        <input type="password" name="password"><br>
        <br>
        <input type="submit" value="Login"> 
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        
    </fieldset>

</form>
</div>
</body>
</html>