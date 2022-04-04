
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads Ads Ads</title>
</head>
<body>
<h1>Here are some Ads</h1>
<form action="/ads/create" method="post">
    <label for="title">Title</label>
    <input name="title" id="title" type="text">
    <br>
    <label for="content">Content</label>
    <input name="content" id="content" type="text">
    <br>
    <label for="price">Price</label>
    <input name="price" id="price" type="text">
    <br>
    <label for="location">Location</label>
    <input name="location" id="location" type="text">
    <input type="submit">


</form>



</body>
</html>
