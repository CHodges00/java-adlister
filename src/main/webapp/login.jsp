<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%

    if (request.getMethod().equalsIgnoreCase("post")){
        String username = request.getParameter("user");
        String password = request.getParameter("pass");
        if (username.equals("admin") && password.equals("password")){
            response.sendRedirect("/profile");
        }
    }

%>

<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="login.jsp" method="post">
    <div>
        <input type="text" placeholder="Username" name="user" required>
    </div>
    <div>
        <input type="password" placeholder="Password" name="pass" required>
    </div>
    <div>
        <button type="submit">Login</button>
    </div>
</form>
</body>
</html>
