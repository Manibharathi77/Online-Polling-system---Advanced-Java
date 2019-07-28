<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
		
		
		<h1>Registration form for Party</h1>
       <form:form method="POST" action="login">  
      	<table >  
      	 
         <tr>  
          <td>User Name : </td> 
          <td><form:input path="username"  /></td>
         </tr>  
         <tr>  
          <td>Password :</td>  
          <td><form:input path="password" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><input type="submit" value="login" /></td>  
         </tr>  
        </table>  
       </form:form> 

