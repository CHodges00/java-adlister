
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Products</title>
    <link rel="stylesheet" href="../../products.css">
</head>
<body>
<h1>Here are all the products</h1>

<div class="all">

<c:forEach var="product" items="${products}">
    <div class="product">
        <h2>${product.name}</h2>
        <hr>
        <p>Price: $ ${product.price}</p>
    </div>
</c:forEach>
</div>
</body>
</html>