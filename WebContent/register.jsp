<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
        <link rel="stylesheet" href="style1.css">
        <link rel="stylesheet" href="style.css">

<meta charset="ISO-8859-1">

</head>
<body>
<div class="header">
  <a href="#default" class="logo">Independent Ltd</a>
  <div class="header-right">
    <a class="active" href="Welcome.jsp">Home</a>
    <a href="video.jsp">Videos</a>
    <a href="About.jsp">About</a>
    <a href="Login.jsp">Login</a>
 </div>



<div class="rsPgae">
        <h4>Registration</h4>
		<form align="center" action=Register method="post">
		<label for="firstname">Firstname : </label>
		<input type="text" name="firstname" size="100"><br>
		<label for="lastname">Last Name : </label>
			<input type="text" name="lastname"><br>
			<label for="emai">email ID : </label>
			<input type="text" name="email" size="100"><br>
			<label for="password">Password</label>
			<input type="password" name="password1" size="20"><br>
			<label for="password1">Re enter Password</label>
			<input type="text" name="password" size="30"><br>
			
            <br>
			<input type="submit" value="Register">
		</form>
        </div>  
        

</body>
</html>