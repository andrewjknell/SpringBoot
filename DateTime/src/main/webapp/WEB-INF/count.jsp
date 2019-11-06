<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="counts">
<button type="submit">click me</button>
</form>
<h1>visits: <c:out value="${count}"/></h1>

<br>
	<a href="/">go home</a>

</body>
</html>