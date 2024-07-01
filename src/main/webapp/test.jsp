<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Nurgissa
  Date: 7/1/2024
  Time: 9:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String name = request.getParameter("name");

        Date date = new Date();
        long time = date.getTime();
    %>
    <%= date + " " + time + " " + name %>


</body>
</html>
