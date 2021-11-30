<%--
  Created by IntelliJ IDEA.
  User: uncleshredder
  Date: 11/30/21
  Time: 11:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />
<form method="POST" action="login.jsp">
    <div class="form-group form-group-sm">
        <div class="col-sm-6">
            <label for="username">Username</label>
            <input type="text" name="username" class="form-control" id="username" aria-describedby="usernameHelp">
        </div>
    </div>
    <div class="form-group form-group-sm">
        <div class="col-sm-6">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" name="password" class="form-control" id="exampleInputPassword1">
        </div>
    </div>
    <div class="form-group form-check ml-3">
        <input type="checkbox" class="form-check-input" id="exampleCheck1">
        <label class="form-check-label" for="exampleCheck1">Remember Me</label>
    </div>
    <div class="form-check ml-0">
         <button type="submit" class="btn btn-primary">Submit</button>
    </div>
</form>

 <% request.setAttribute("username", request.getParameter("username")); %>
<%--<h4>Username: ${username}</h4>--%>

<% request.setAttribute("password", request.getParameter("password")); %>
<%--<h4>Password: ${password}</h4>--%>

<c:choose>
    <c:when test="${username.equals('admin') && password.equals('password')}">
       <c:redirect url="profile.jsp"/>
    </c:when>

    <c:otherwise>
<%--        <c:redirect url="login.jsp"/>--%>
    </c:otherwise>
</c:choose>


<jsp:include page="partials/scripts.jsp"/>
</body>
</html>
