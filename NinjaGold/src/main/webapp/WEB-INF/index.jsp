<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="css/style.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninja Gold</title>
</head>
<body>
<h1 id="title">Your Gold </h1>
<h1 id="golding">${gold}</h1>

<div class="getGold">
	<h2>Farm</h2>
	<h5>(earns 10-20 gold)</h5>
	<form action="/gold" method="POST">
	<input type="hidden" name="goldy" value="farm">
	<button type="submit">find gold!</button>
	</form>
</div>

<div class="getGold">
	<h2>Cave</h2>
	<h5>(earns 5-10 gold)</h5>
	<form action="/gold" method="POST">
	<input type="hidden" name="goldy" value="cave">
	<button type="submit">find gold!</button>
	</form>
</div>

<div class="getGold">
	<h2>House</h2>
	<h5>(earns 2-5 gold)</h5>
	<form action="/gold" method="POST">
	<input type="hidden" name="goldy" value="house">
	<button type="submit">find gold!</button>
	</form>
</div>

<div class="getGold">
	<h2>Casino</h2>
	<h5>(earns/takes 0-50 gold)</h5>
	<form action="/gold" method="POST">
	<input type="hidden" name="goldy" value="casino">
	<button type="submit">find gold!</button>
	</form>
</div>

</body>
</html>