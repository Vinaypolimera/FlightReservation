<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>

<form action="registerUser" method="post">
<pre>
First Name : <input type="text" name="firstName">
Last Name  : <input type="text" name="lastName">
User Name : <input type="email" name="email">
Password : <input type="password" name="password">
Conform Password : <input type="password"name="conformPassword">

<input type="submit" value="Register">
</pre>
</form>
</body>
</html>