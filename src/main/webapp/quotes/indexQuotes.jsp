<%--
  Created by IntelliJ IDEA.
  User: uncleshredder
  Date: 12/6/21
  Time: 12:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <c:forEach var="ad" items="${quotes}">
    <div class="col-md-6">
       <h2>${quote.get}</h2>
        <p>${quote.content}</p>
    </div>
  </c:forEach>

</body>
</html>
