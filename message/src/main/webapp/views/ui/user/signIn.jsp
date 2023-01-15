/<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        body
        {
            background-image: linear-gradient(to top, #e0e8bd, #e9f8f8);
        }
        button {
            background: #e9f8f8;
            width: 45%;
            border-width: 3px;
            border-style: ridge;
            border-color: lightgray;
            font-weight: bold;
            color: #ff2f00;
            border-radius: 8px;
            padding: 0.5rem 0.5rem;
            margin-bottom: 0.5rem;
            text-decoration: none;
            cursor: pointer;
            box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
        }
        button:hover {background-color: #DEDEDEFF
        }

        button:active {
            background-color: #DEDEDEFF;
            box-shadow: 0 5px rgba(227, 227, 227, 0.78);
            transform: translateY(4px);
        }

    </style>
    <title>Авторизация</title>

</head>
<body>
<div style="width:30%;
            font-size: 14px;
            text-align: center;
            background-image: linear-gradient(to top, #c3d2ff, #d8edff);;
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
            border-radius: 10px;">
<form method="POST" action="${pageContext.request.contextPath}/api/login">
    <h2  style="color: #4e5077" class="logo">Пройдите авторизацию</h2>
    <label>
        <input style="color: #a04c1f" type="text" name="user" placeholder="Логин"/>
    </label> <br><br>
    <label>
        <input style="color: #a04c1f"type="text" name="password" placeholder="Пароль"/>
    </label> <br><br>

    <button style="color: orangered" type="submit" class="border-button">Войти</button >
</form>
</div>
</body>
</html>

