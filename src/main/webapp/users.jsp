<%@ page import="org.example.models.User" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: a.yertuyak
  Date: 02.05.2020
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList<User> users =
            (ArrayList) request.getAttribute("user");
%>
<table>
    <tr>
        <th>User name</th>
        <th>Password</th>
    </tr>
        <% for (User user : users) {
    %>
    <tr>
        <td><%=user.getNickname()%>
        </td>
        <td><%=user.getPassword()%>
        </td>
    </tr>
        <%}%>

</body>
</html>
