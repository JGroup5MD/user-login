<%@ page import="org.example.DAO.UserAndRoleRegistrationDAO" %>
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
    <title>Авторизация</title>

</head>
<body>
<form method="POST" action="${pageContext.request.contextPath}/api/user">
    <label>
        <input type="text" name="loginIn" placeholder="Логин"/>
    </label> <br><br>
    <label>
        <input type="text" name="passwordIn" placeholder="gароль"/>
    </label> <br><br>

    <button type="submit" class="border-button">войти</button>
</form>
</body>
</html>


