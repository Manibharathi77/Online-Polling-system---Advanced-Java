<%@page import="com.bean.Bean4party"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border = "3">
<tr>
<td> Party name </td>
<td> Vote count </td>
</tr>
<%List<Bean4party>  list = (List<Bean4party>)request.getAttribute("list");
for(Bean4party r : list)
{%>
	<tr>
	<td><%=r.getParty() %></td>
	<td><%=r.getCount()%></td>
	</tr>
<% 	}%>
</table>
</body>
</html>