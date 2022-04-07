<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
    <h1>Hello, ${sessionScope.user.username}<br> you are now viewing your profile.</h1>
</div>
<button type="button" id="create">Create Your Ad Here!</button>

<button type="button" id="logout">Logout</button>

<p>${sessionScope.user.username}</p>

<script>
    document.getElementById("logout").onclick = function (){
        document.location = "http://localhost:8081/logout"
    }

    document.getElementById("create").onclick = function (){
        document.location = "http://localhost:8081/ads/create"
    }
</script>

</body>
</html>