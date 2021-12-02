<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: uncleshredder
  Date: 12/1/21
  Time: 11:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    <jsp:include page="partials/navbar.jsp"/>--%>
        <div class="container">
            <h1>Create your own pizza</h1>
            <form action="/pizza-order" method="POST">
                <div class="form-group">
                    <label for="crust">Choose your Crust</label>
                    <select id="crust" name="crust" class="form-control">
                        <option>Pan</option>
                        <option>Thin crust</option>
                        <option>Stuffed crust</option>
                        <option>Flat bread</option>
                    </select>
                </div>
                <div class="form-check">
                    <input id="toppings1" name="toppings" class="form-check-input" type="checkbox" value="cheese">
                    <label class="form-check-label" for="toppings1">Cheese</label>
                </div>
                <div class="form-check">
                    <input id="toppings2" name="toppings" class="form-check-input" type="checkbox" value="pepperoni">
                    <label class="form-check-label" for="toppings2">Pepperoni</label>
                </div>
                <div class="form-check">
                    <input id="toppings3" name="toppings" class="form-check-input" type="checkbox" value="italian Sausage">
                    <label class="form-check-label" for="toppings3">Italian Sausage</label>
                </div>
                <div class="form-check">
                    <input id="toppings4" name="toppings" class="form-check-input" type="checkbox" value="ham">
                    <label class="form-check-label" for="toppings4">Ham</label>
                </div>
                <div class="form-check">
                    <input id="toppings5" name="toppings" class="form-check-input" type="checkbox" value="mushrooms">
                    <label class="form-check-label" for="toppings5">Mushrooms</label>
                </div>
                <div class="form-check">
                    <input id="toppings6" name="toppings" class="form-check-input" type="checkbox" value="pineapples">
                    <label class="form-check-label" for="toppings6">Pineapples</label>
                </div>
                <div class="form-group">
                    <label for="customerAddress">Enter delivery address</label>
                    <textarea class="form-control" name="customerAddress" id="customerAddress" rows="2"></textarea>
                </div>
                <input type="submit" class="btn btn-primary btn-block" value="Submit Order">
            </form>
        </div>


</body>
</html>
