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
	String success = "Your old password is incorrect or new password is blank"; 
	if (oldpassword.equals("pass123")&& !newpassword.equals("pass123") && !newpassword.equals("")){
		success = "Your password changed successfully";
	}
	%>
	<%@ include file="ChangePass.html" %>
	<%= success %>
</body>
</html>