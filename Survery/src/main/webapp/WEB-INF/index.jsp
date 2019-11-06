<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/script.js"></script>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Dojo Survery</h1>
<form method="POST" action="/form">
    Name: <input type="text" name="name">
    <br>
    Dojo:
    <select name="dojo">
    <option value="san jose">San Jose</option>
    <option value="oc">OC</option>
    <option value="seattle">Seattle</option>
    </select>
    <br>
    Fave Language:
    <select name="language">
    	<option value="java">Java</option>
    	<option value="python">Python</option>
    	<option value="javascript">JavaScript</option>
    </select>
    <br>
    Comments (optional):
    <textarea name="comment"></textarea>
<br>
    <button type="submit">guess</button>
</form>
</body>
</html>