<%--
  Created by IntelliJ IDEA.
  User: uncleshredder
  Date: 12/2/21
  Time: 7:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp"/>
    <title>User Takes A Guess</title>
</head>
<body>
    <form method="POST">
    <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="user-selection" id="inlineRadio1" value="1">
        <label class="form-check-label" for="inlineRadio1">1</label>
    </div>
    <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="user-selection" id="inlineRadio2" value="2">
        <label class="form-check-label" for="inlineRadio2">2</label>
    </div>
    <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="user-selection" id="inlineRadio3" value="3">
        <label class="form-check-label" for="inlineRadio3">3</label>
    </div>
        <input type="submit" class="btn btn-primary btn-block" value="Submit">
    </form>
</body>
</html>
