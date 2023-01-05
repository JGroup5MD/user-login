<%@ page import="org.example.service.StatisticsService" %>
<%@ page import="org.example.service.MessageService" %>
<%@ page import="org.example.service.LoginService" %>
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
    <title>Title</title>

</head>
<body >
<p>Registered users: ${getAllUsers}</p>
<p>Active users: ${getActiveUsers}</p>
<p>Count massage: ${getAllmassege}</p>
</body>
</html>