<%@page import="java.util.ArrayList"%>
 <%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Voting site</title>
</head>
<body>
<table border = "1">
<tr>
<td>Name of the party</td> 
<td>Vote button</td> 
</tr>

<% ArrayList<String> list = (ArrayList<String>)request.getAttribute("list"); %>

<% for(String i : list) 
{%>
<tr>
<td><%= i%></td>
<% System.out.println(i); %>
<td>

<form action="Check1.jsp">
<input type="hidden" name="party" value="<%=i%>">
<input type="submit" value="Vote">
</form>
</td>
</tr>
<%}%>
<% System.out.println("checking..."); %>
</table>
</body>
</html>