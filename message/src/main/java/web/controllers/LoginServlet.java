package web.controllers;

import web.service.PasswordEncryptionService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
*Написать сервлет /api/login на который будут отправляться данные для входа используя POST запрос:
*Логин
*Пароль
*Если не нашли пользователя или не подошел пароль, выдать ошибку.
* */

@WebServlet(name = "RegistrationServlet", urlPatterns = "/api/user")
public class LoginServlet extends HttpServlet {

    private final String LOGIN_PARAM_NAME = "login";
    private final String PASSWORD_PARAM_NAME = "password";

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        String login = req.getParameter(LOGIN_PARAM_NAME);
        String password = req.getParameter(PASSWORD_PARAM_NAME);

        PasswordEncryptionService passCheck = new PasswordEncryptionService();


    }
}
