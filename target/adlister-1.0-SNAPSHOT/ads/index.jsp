<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads</title>
</head>
<body>

<h2>Ads:</h2>

<c:forEach var="Ad" items="${Ads}">
<div class="Ad">
    <h1>Title: ${Ad.title}</h1>
    <p>Content: ${Ad.content}</p>
    <p>Price: ${Ad.price}</p>
    <p>Location: ${Ad.location}</p>
</c:forEach>
</div>
</body>
</html>
