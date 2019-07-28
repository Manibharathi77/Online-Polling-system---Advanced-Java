<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CHECK!!!</title>
</head>
<body>
<%String party1 = (String)request.getParameter("party"); %>
<% System.out.println(party1); %>
<p> <%=party1 %> </p>
<form method = "get" action ="Confirm1">
<input name="name" value="<%= party1%>">
<input type = "submit" value = "Confirm">
</form>
</body>
</html>