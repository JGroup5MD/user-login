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
    <title>Авторизация</title>

</head>
<body>
<form method="POST" action="${pageContext.request.contextPath}/ui/signIn">
    <label>
        <input type="text" name="loginIn" placeholder="Логин"/>
    </label> <br><br>
    <label>
        <input type="text" name="passwordIn" placeholder="gароль"/>
    </label> <br><br>

    <button type="submit" class="border-button">войти</button >
</form>
</body>
</html>


