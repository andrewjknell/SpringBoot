<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="Survey/src/main/resources/static/css/style.css">
<script type="text/javascript" src="js/script.js"></script>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>${error}</h2>
<h1>Can You Guess the Secret Word</h1>
<form method="POST" action="/guess">
    <input type="text" name="guess">
    <button type="submit">guess</button>
</form>

</body>
</html>