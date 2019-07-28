    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>vote panel</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Party name</th><th>vote</th></tr>
    <c:forEach var="list" items="${list}"> 
    <tr>
    <td>${list.party}</td>
    <td><a href="vote/${list.party}">vote</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="index">Index page</a>	