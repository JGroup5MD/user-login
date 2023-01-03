package controllers;

import dto.UserDataDto;
import service.api.IUserDataDto;
import service.fabrics.UserDataSingleton;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(name = "Registration", urlPatterns = "/api/user")
public class RegistrationServlet extends HttpServlet {
//    private final String LOGIN = "login";
//    private final String PASSWORD = "password";
//    private final String PASSWORD_CONFIRM = "passwordConfirm";
//    private final String FIRST_NAME = "firstName";
//    private final String LAST_NAME = "lastName";
//    private final String DATE_OF_BIRTH = "dateOfBirth";
    private LocalDateTime dateOfRegistration;
    private Date dateOfBirth;


    //    private final UserRoles roles;
    private final IUserDataDto service;




    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        String login = req.getParameter("login");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String password = req.getParameter("password");
        String passwordConfirm = req.getParameter("passwordConfirm");

        if (password.equals(passwordConfirm)) {
            dateOfRegistration = LocalDateTime.now();
            try {
                dateOfBirth = new SimpleDateFormat("dd.MM.yyyy").parse(req.getParameter("dateOfBirth"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            UserDataDto.UserCreate create =
                    UserDataDto.UserCreate.create()
                            .setLogin(login)
                            .setPassword(password)
                            .setFirstName(firstName)
                            .setLastName(lastName)
                            .setDateOfBirth(dateOfBirth)
                            .setDateOfRegistration(dateOfRegistration);

            this.service.save(create.build());

        } else writer.write("Введенные пароли не совпадают");

    }

    public RegistrationServlet() {
        this.service = UserDataSingleton.getInstance();
    }

}
