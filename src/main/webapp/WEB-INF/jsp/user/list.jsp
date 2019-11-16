<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users List</title>
</head>
<body>
 <a href='<c:url value="/logout" />'>Logout</a>
 <br/>
 <br/>
 <h1>AN ADMIN CAN NOT CREATE A BOOK YET. YOU CAN TRY THIS FEATURE LATER</h1>
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
  
</body>
</html>