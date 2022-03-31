<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:choose>
  <c:when test="${cart.isEmpty()}">
    <h2>No items in cart</h2>
  </c:when>

  <c:otherwise>
    <c:forEach var="item" items="${cart.items}">
      <div class="item">
        <h3>${item.name}</h3>
        <p>${item.description}</p>
        <p>${item.price}</p>
        <c:if test="${item.isOnSale}">
          <p>This item is on sale !</p>
        </c:if>
      </div>
    </c:forEach>
  </c:otherwise>



</c:choose>

<%--<html>--%>
<%--<head>--%>
<%--  <title>Profile</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1>Profile</h1>--%>

<%--<% request.setAttribute("message", "this message was added with setAttribute");%>--%>

<%--<h5>fav_food : ${param.fav_food}</h5>--%>

<%--<h2>${message}</h2>--%>


<%--</body>--%>
<%--</html>--%>