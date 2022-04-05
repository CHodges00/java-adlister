<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp" />

<div class="container">
    <h1>Hello, ${user}<br> you are now viewing your profile.</h1>
</div>

<button type="button" id="logout">Logout</button>

<script>
    document.getElementById("logout").onclick = function (){
        document.location = "http://localhost:8081/logout"
    }
</script>

</body>
</html>