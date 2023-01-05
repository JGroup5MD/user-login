<%@ page import="org.example.DAO.MessageDAO" %>
<%@ page language="java" contentType= "text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<style>
    body
        {
        width:30%;
        font-size: 14px;
        text-align: center;
        background: #d0dcf4;
        position: absolute;
        top: 50%;
        left: 50%;
        margin-right: -50%;
        transform: translate(-50%, -50%);
        box-shadow: 0 3px 10px rgba(0, 0, 0.5);
        font-family: Bookman,sans-serif;
        padding: 20px 10px;
        border-style: ridge;
        border-width: 4px 4px 4px 4px;
        border-color: lightgray;
        border-radius: 10px;
        }
</style>
    <title>Message</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/api/message" method="post">
    <label>
        <input type="text" name="recipient" placeholder="получатель"/>
    </label> <br><br>
    <label>
        <input type="text" name="essage" placeholder="текст сообщения"/>
    </label> <br><br>

    <button type="submit" class="border-button">отправить</button >
</form>
</body>
</html>

