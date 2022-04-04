

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads</title>
</head>
<body>

<h2>Ads:</h2>

<c:forEach var="Ad" items="${Ads}">
<div class="Ad">
    <h1>${Ad.title}</h1>
    <p>${Ad.content}</p>
    <p>${Ad.price}</p>
    <p>${Ad.location}</p>
</div>
</c:forEach>

</body>
</html>
