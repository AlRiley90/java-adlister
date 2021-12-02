<%--
  Created by IntelliJ IDEA.
  User: uncleshredder
  Date: 12/2/21
  Time: 10:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp"/>
    <title>User's Favorite Color</title>
</head>
<body>
<form method="POST">
    <div class="form-group">
        <label for="favoriteColor">Enter your favorite color</label>
        <textarea class="form-control form-control-sm" name="userColor" id="favoriteColor" rows="1"></textarea>
        <input type="submit" class="btn btn-primary btn-block" value="View Color">
    </div>

</form>

</body>
</html>
