<%@ page import="org.example.DAO.MessageDAO" %>
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
    <title>Chats</title>

</head>
<body>
<h1>Сообщения для пользователя: "${receiver.dto.login}"</h1>
<br><br>
<c:forEach items="${messages}" var="item">
    <p>${param["sender"]}</p>
    <p>${param["message"]}</p>
    <p>${item.dtAcceptance.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))} от
            ${item.message.from.M.login}: ${item.message.text}</p>
</c:forEach>
<p><a href="${pageContext.request.contextPath}/ui/user/message">Написать и отправить сообщение</a></p>
<p><a href="${pageContext.request.contextPath}/ui">Вернуться на главную страницу</a></p>
</body>
</html>