<%@ page import="org.example.DAO.UserAndRoleRegistrationDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <title>Регистрация нового пользователя</title>
</head>
<body>
<form method="POST" action="${pageContext.request.contextPath}/api/user">
    <h2 class="logo">Введите данные для регистрации</h2>
    <label>
        <input type="text" id="login" name="login" placeholder="логин"></Label><br><br>
    <label>
        <input type="password" id="password"  name="password" placeholder="пароль"></label><br><br>
    <label>
        <input type="text" id="FirstName" name="FirstName"  placeholder="фамилия"></label><br><br>
    <label>
        <input type="text" id="MidlName" name="MidlName"  placeholder="имя"></label><br><br>
    <label>
        <input type="text" id="LastName" name="LastName"  placeholder="отчество"></label><br><br>
    <label>
        <input type="text" id="birthDate" name="birthDate" placeholder="ГГГГ-ММ-ДД"></label><br><br>

    <button type="submit" class="border-button">Зарегистрироваться</button>
</form>
</body>
</html>
