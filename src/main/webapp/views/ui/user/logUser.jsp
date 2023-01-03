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
    <label>
    <button type="submit" class="border-button">Зарегистрироваться</button>
</form>
</body>
</html>
