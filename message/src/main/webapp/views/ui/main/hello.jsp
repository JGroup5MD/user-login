<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        body
        {
            background-image: linear-gradient(to top, #e0e8bd, #e9f8f8);
        }
        .a{
            cursor: pointer;
        }

    </style>
    <title>Main page</title>

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
<h1 style="color: #4e5077">Добро пожаловать</h1>
<h3 style="color: #a04c1f"><a class="a" href="${pageContext.request.contextPath}/ui/signIn">Вход</a></h3>
    <h3 style="color: #a04c1f"><a class="a" href="${pageContext.request.contextPath}/ui/signUp">Регистрация </a></h3>
</div>
</body>
</html>
