<%--
  Created by IntelliJ IDEA.
  User: uncleshredder
  Date: 11/30/21
  Time: 9:33 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int counter = 0; String name = "Alex"; %>
<% counter += 1;
    request.setAttribute("NumberOfVisits", counter);
%>
<html>
<head>
    <title>Counter w/ Navbar</title>
</head>
<body>

<jsp:include page="partials/navbar.jsp" />

<%
    if(request.getParameter("reset")!= null && request.getParameter("reset").equals("true")){
        counter = 0;
    }


%>

<h1>The current count is ${NumberOfVisits}.</h1>

<p>My name is <%= name%>.</p>

<p>resetting counter: ${param.reset}</p>

<p>Here are your results for ${param.searchTerm}</p>

View page source!

<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->
<jsp:include page="partials/scripts.jsp"/>
</body>
</html>
