package web.controllers;

import web.dto.NewUserDto;
import web.service.api.IRegistrationService;
import web.service.fabrics.RegistrationServiceSingleton;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet(name = "RegistrationServlet", urlPatterns = "/api/user")
public class RegistrationServlet extends HttpServlet {

    private final String LOGIN_PARAM_NAME = "login";
    private final String PASSWORD_PARAM_NAME = "password";
    private final String PASSWORD_CONFIRM_PARAM_NAME = "passwordConfirm";
    private final String NAME_PARAM_NAME = "Name";
    private final String MIDNAME_PARAM_NAME = "MiddleName";
    private final String LASTNAME_PARAM_NAME = "LastName";
    private final String DATEOFBIRTH_PARAM_NAME = "dateOfBirth";

    private final IRegistrationService service;

    public RegistrationServlet() {
        this.service = RegistrationServiceSingleton.getInstance();
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        String name = req.getParameter(NAME_PARAM_NAME);
        String middleName = req.getParameter(MIDNAME_PARAM_NAME);
        String lastName = req.getParameter(LASTNAME_PARAM_NAME);
        String login = req.getParameter(LOGIN_PARAM_NAME);
        String password = req.getParameter(PASSWORD_PARAM_NAME);
        String passwordConfirm = req.getParameter(PASSWORD_CONFIRM_PARAM_NAME);
        String dateOfBirth = req.getParameter(DATEOFBIRTH_PARAM_NAME);

        if (name.isEmpty() || lastName.isEmpty() || dateOfBirth.isEmpty()){
            throw new IllegalArgumentException("Один из обязательных параментров не заполнен");
        }

        if(!password.equals(passwordConfirm)) {
            throw new IllegalArgumentException("Пароли не совпадают");
        }


        NewUserDto.UserBuilder builder =
                NewUserDto.UserBuilder.create()
                        .setName(name)
                        .setMiddleName(middleName)
                        .setLastName(lastName)
                        .setDateOfBirth(dateOfBirth)
                        .setLogin(login)
                        .setPassword(password);

        this.service.save(builder.build());

        PrintWriter writer = resp.getWriter();
        writer.write("Hello " + name);


    }




}
