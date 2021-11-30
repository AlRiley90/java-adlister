<%--
  Created by IntelliJ IDEA.
  User: uncleshredder
  Date: 11/30/21
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%! int visits = 0;
    boolean hasUserBeenHere = false;
%>
<%
    if(visits == 0) {
        request.setAttribute("hasUserBeenHere", false);
    }else{
        request.setAttribute("hasUserBeenHere", true);
    }

    visits++;
%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>
<h1>Mission Statement</h1>

<c:choose>
    <c:when test="${hasUserBeenHere}">
        <h2>Welcome Back</h2>
    </c:when>
    <c:otherwise>
        <h2>Hello for the first time</h2>
    </c:otherwise>
</c:choose>

<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. A consectetur corporis dignissimos iure laboriosam nesciunt nobis quisquam saepe similique sunt! Debitis distinctio eveniet expedita officiis quod recusandae sunt, tempore tenetur.</p>
<jsp:include page="partials/scripts.jsp"/>
</body>
</html>
