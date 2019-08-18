<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change password</title>
</head>
<body>
	<%
	String oldpassword = request.getParameter("oldpassword");
	String newpassword = request.getParameter("newpassword");
	String pass = (String) session.getAttribute("tojsp");
	String success = "Your old password is incorrect or new password is blank/same as previous"; 
	if (oldpassword.equals(pass)&& !newpassword.equals(pass) && !newpassword.equals("")){
		success = "Your password changed successfully";
		session.setAttribute("pa", newpassword);
		System.out.println("New password is updated");
	}
	%>
	<%@ include file="ChangePass.html" %>
	<%= success %>
	<br>
	<a href="index.html"> Log in again</a>
</body>
</html>