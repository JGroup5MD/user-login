package controllers;

import dto.NewUserDto;
import service.api.IRegistrationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@WebServlet(name = "RegistrationServlet", urlPatterns = "/api/user")
public class RegistrationServlet extends HttpServlet {

    private final String LOGIN_PARAM_NAME = "login";
    private final String PASSWORD_PARAM_NAME = "password";
    private final String NAME_PARAM_NAME = "ФИО";
    private final String DATEOFBIRTH_PARAM_NAME = "date_of_birth";

    private final IRegistrationService service;
    public RegistrationServlet() {
        this.service = null; //дописать реализацию!!!
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        Map<String, String[]> parameterMap = req.getParameterMap();

        String[] name = parameterMap.get(NAME_PARAM_NAME);
        String[] login = parameterMap.get(LOGIN_PARAM_NAME);
        String[] password = parameterMap.get(PASSWORD_PARAM_NAME);
        String dateOfBirth = req.getParameter(DATEOFBIRTH_PARAM_NAME);

        String loginRaw = (login == null) ? null : login[0];
        if(loginRaw == null || login.length > 1) {
            throw new IllegalArgumentException("Должен быть указан один логин");
        }

        String passwordRow = (password == null) ? null : password[0];
        if(passwordRow == null || password.length > 1){
            throw new IllegalArgumentException("Должен быть один пароль");
        }

        SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd"); //паттерн потом обозначить в jsp
        try {
            Date parse = format.parse(dateOfBirth);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


        NewUserDto.UserBuilder builder =
                NewUserDto.UserBuilder.create()
                        .setId(1)
                        .se


       /* req.setAttribute("userName", name);
        doGet(req, resp);*/
    }


}
