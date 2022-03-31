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
