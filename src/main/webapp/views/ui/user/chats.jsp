<%@ page import="org.example.DAO.MessageDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
         {
             width: 100%;
             font-size: 14px;
             text-align: center;
             background: greenyellow;
             padding: 10px 20px;
             border-style: solid;
             border-width: 0 1px 1px 0;
             border-color: green;
        }
    </style>
    <title>Chats</title>

</head>
<body >
<p class="logo">Пользователь: ${sender} </p>
<form method="POST" action="${pageContext.request.contextPath}/api/message">
    <label>
    <input type="text" id="recipient" name="recipient" placeholder="получатель"></label><br><br>
    <label>
       <input type="text" id="text" name="text"></label><br><br>
    <button type="submit" class="border-button">Отправить</button>
</form>
</body>
</html>
