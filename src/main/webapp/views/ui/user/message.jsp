<%@ page import="org.example.DAO.MessageDAO" %>
<%@ page language="java" contentType= "text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
    <title>Message</title>
</head>
<body>
<<p> Recipient: ${paramValues.recipient}</p>
<br><br>
<p> Message: ${paramValues.message}</p>
<br><br>
</body>
</html>

