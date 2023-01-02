package web.controllers;

import web.dao.UserDao;
import web.dao.api.IUserDao;
import web.dto.LoginDto;
import web.dto.UserDto;
import web.service.api.ILoginService;
import web.service.fabrics.LoginServiceSingleton;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import static web.model.SessionKitchen.getSessionValue;
import static web.model.SessionKitchen.saveSession;

/*
*Написать сервлет /api/login на который будут отправляться данные для входа используя POST запрос:
*Логин
*Пароль
*Если не нашли пользователя или не подошел пароль, выдать ошибку.
* */

@WebServlet(name = "LoginServlet", urlPatterns = "/api/login")
public class LoginServlet extends HttpServlet {

    private static final String LOGIN_PARAM_NAME = "login";
    private static final String PASSWORD_PARAM_NAME = "password";
    private final ILoginService service;

    public LoginServlet() {
        this.service = LoginServiceSingleton.getInstance();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        PrintWriter writer = resp.getWriter();


        writer.write(service.get().get(0).getNewUserDto().getLogin());

        String login = req.getParameter(LOGIN_PARAM_NAME);
        String password = req.getParameter(PASSWORD_PARAM_NAME);

        LoginDto creds = new LoginDto(login, password);

        String loginVal = null;
        if(service.getAuthorized(creds)){
            loginVal = getSessionValue(req, LOGIN_PARAM_NAME);
            saveSession(req, LOGIN_PARAM_NAME, loginVal);
        }
        
        writer.write("hello " + loginVal);

    }
}
