<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form> method="post" commandName="account" action="${pageContext.request.contextPath }/account/signup.html"
 <table>
 	<tr>
 		<td>Username</td>
 		<td>
 			<s:input path="username"/>
 		</td>
 		
 	</tr>
 	
 	<tr>
 		<td>Password</td>
 		<td>
 			<s:password path="password"/>
 		</td>
 	</tr>
 	
 	<tr>
 		<td>Full Name</td>
 		<td>
 			<s:input path="fullName"/>
 		</td>
 	</tr>
 	
 	<tr>
 		<td>Status</td>
 		<td>
 			<s:checkbox path="status"/>
 		</td>
 		
 	</tr>
 	
 	<tr>
 		<td>&nbsp;</td>
 		<td>
 			<input type="submit" value="Save"/>
 		</td>
 	</tr>
 </table>
 </s:form>
</body>
</html>