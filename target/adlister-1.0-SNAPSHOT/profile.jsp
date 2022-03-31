<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
<h1>${param.user}</h1>

<% request.setAttribute("message", "Welcome to your profile!");%>

<h2>${message}</h2>


</body>
</html>
