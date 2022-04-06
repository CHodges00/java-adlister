
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads App</title>
    <link rel="stylesheet" href="../../ads.css">
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Create a new Ad" />
    </jsp:include>
</head>
<body>
<h1>Create an Ad !</h1>
<form action="/ads/create" method="post">
    <label for="title">Title</label>
    <input name="title" id="title" type="text">
    <br>
    <label for="description">Description</label>
    <input name="description" id="description" type="text">
<%--    <br>--%>
<%--    <label for="price">Price</label>--%>
<%--    <input name="price" id="price" type="text">--%>
<%--    <br>--%>
<%--    <label for="location">Location</label>--%>
<%--    <input name="location" id="location" type="text">--%>
<%--    <input type="submit">--%>


</form>



</body>
</html>
