package web.controllers;

import web.dto.NewUserDto;
import web.service.api.IRegistrationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/*
* 2. Написать сервлет /api/user на который будут отправляться данные для регистрации при помощи POST запроса:
Логин\Пароль
ФИО
Дата рождения
* */

@WebServlet(name = "RegistrationServlet", urlPatterns = "/api/user")
public class RegistrationServlet extends HttpServlet {

    private final String LOGIN_PARAM_NAME = "login";
    private final String PASSWORD_PARAM_NAME = "password";
    private final String PASSWORD_CONFIRM_PARAM_NAME = "passwordConfirm";
    private final String NAME_PARAM_NAME = "Name";
    private final String MIDNAME_PARAM_NAME = "MiddleName";
    private final String LASTNAME_PARAM_NAME = "LastName";
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

        String name = req.getParameter(NAME_PARAM_NAME);
        String middleName = req.getParameter(MIDNAME_PARAM_NAME);
        String lastName = req.getParameter(LASTNAME_PARAM_NAME);
        String[] login = parameterMap.get(LOGIN_PARAM_NAME);
        String[] password = parameterMap.get(PASSWORD_PARAM_NAME);
        String[] passwordConfirm = parameterMap.get(PASSWORD_CONFIRM_PARAM_NAME);
        String dateOfBirth = req.getParameter(DATEOFBIRTH_PARAM_NAME);

        if (name.isEmpty() || lastName.isEmpty() || dateOfBirth.isEmpty()){
            throw new IllegalArgumentException("Один из обязательных параментров не заполнен");
        }

        if(!password.equals(passwordConfirm)){
            throw new IllegalArgumentException("Пароли не совпадают");
        }
        String loginRaw = (login == null) ? null : login[0];
        if (loginRaw == null || login.length > 1) {
            throw new IllegalArgumentException("Должен быть указан один логин");
        }

        String passwordRaw = (password == null) ? null : password[0];
        if (passwordRaw == null || password.length > 1) {
            throw new IllegalArgumentException("Должен быть один пароль");
        }

        SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd"); //паттерн потом обозначить в jsp
        Date parse;
        try {
            parse = format.parse(dateOfBirth);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


        NewUserDto.UserBuilder builder =
                NewUserDto.UserBuilder.create()
                        .setName(name)
                        .setMiddleName(middleName)
                        .setLastName(lastName)
                        .setDateOfBirth(parse)
                        .setLogin(loginRaw)
                        .setPassword(passwordRaw);

        this.service.save(builder.build());

        PrintWriter writer = resp.getWriter();
        writer.write(builder.build().getLogin());


       /* req.setAttribute("userName", name);
        doGet(req, resp);*/
    }


}
