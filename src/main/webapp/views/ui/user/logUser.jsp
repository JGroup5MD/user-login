<%@ page import="org.example.DAO.CredentialsDAO" %>
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
    <title>Autorisation</title>
</head>
<body>

<p> Login: ${paramValues.login}</p>
            <br><br>
<p> Password: ${paramValues.password}</p>
            <br><br>

</body>
</html>
