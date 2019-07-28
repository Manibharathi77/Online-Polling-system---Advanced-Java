<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
		
		
		<h1>Registration form for Party</h1>
       <form:form method="POST" action="regsave">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="id" /></td>
         </tr> 
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Age :</td>  
          <td><form:input path="age" /></td>
         </tr> 
          <tr>  
          <td>Gender :</td>  
          <td><form:input path="gender" /></td>
         </tr>
          <tr>  
          <td>Location :</td>  
          <td><form:input path="location" /></td>
         </tr>
         <tr>  
          <td>Phone :</td>  
          <td><form:input path="ph" /> </td>
         </tr> 
          <tr>  
          <td>Party :</td>  
          <td><form:input path="party" /></td>
         </tr>
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Register" /></td>  
         </tr>  
        </table>  
       </form:form> 

