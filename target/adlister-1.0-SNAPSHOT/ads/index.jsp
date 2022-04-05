<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads App</title>
    <link rel="stylesheet" href="../ads.css">
</head>
<body>

<h2>Ads App</h2>

<c:forEach var="Ad" items="${Ads}">
<div class="Ad">
    <div>
    <h1>Title: ${Ad.title}</h1>
    </div>
    <div>
    <p>Content: ${Ad.content}</p>
    </div>
    <div>
    <p>Price: ${Ad.price}</p>
    </div>
    <div>
    <p>Location: ${Ad.location}</p>
    </div>
</div>
</c:forEach>

</body>
</html>
