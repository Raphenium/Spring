<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
 <a href='<c:url value="/logout" />'>Logout</a>
 <h1>Welcome 
 <c:if test="${pageContext.request.userPrincipal.name != null }">
 ${pageContext.request.userPrincipal.name }
 </c:if> </h1>
 <br/>
 

 <form action='<c:url value="hello" />' method="GET" >
  <table>
   <tr>
    <td colspan="2">Check</td>
   </tr>
   <tr>
    <td colspan="2">${msg }</td>
   </tr>
   <tr>
    <td>TITLE: </td>
    <td>
     <input type="text" name="title" />
    </td>
   </tr>
   <tr>
    <td>ISBN: </td>
    <td>
     <input type="text" name="ISBN" />
    </td>
   </tr>
   <tr>
 	<td>
     <button type="submit">Check</button>
    </td>
   </tr>
   <tr>
    <td></td>
   </tr>
  </table>
 </form>
 
 
 
 <a href='<c:url value="/user/list" />'>Admin? Click to Create Book</a>
</body>
</html>