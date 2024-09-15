<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login" method ="get">
		<label> Enter the Username </label>
		<input type ="text" name ="uname">
		
		<label> Enter the Password </label>
		<input type ="text" name ="pass">
		
		<input type ="submit" name ="submit">
		
			
		
	</form>
	
	<% out.println(request.getAttribute("msg")); 
	%>

</body>
</html>