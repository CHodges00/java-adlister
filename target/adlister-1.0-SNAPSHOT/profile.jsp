<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
<h1>Profile</h1>

<% request.setAttribute("message", "this message was added with setAttribute");%>

<h5>fav_food : ${param.fav_food}</h5>

<h2>${message}</h2>


</body>
</html>
