<%@ page import="static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List" %>
<%@ page import="org.example.DAO.UserDAO" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Vitalik
  Date: 19.12.2022
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main JSP</title>

</head>
<body>
<h1>Hello!!!</h1>
<% int x=2*3;%>
<%@include file="hello.jsp" %>
<%= x %>
</body>
</html>
Страница hello.jsp
<%= x=5; %>
