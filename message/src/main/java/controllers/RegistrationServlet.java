package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "RegistrationServlet", urlPatterns = "/api/user")
public class RegistrationServlet extends HttpServlet {

    private final String LOGIN_PARAM_NAME = "login";
    private final String PASSWORD_PARAM_NAME = "password";
    private final String NAME_PARAM_NAME = "ФИО";
    private final String DATEOFBIRTH_PARAM_NAME = "date_of_birth";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        String name = req.getParameter(NAME_PARAM_NAME);
        String login = req.getParameter(LOGIN_PARAM_NAME);
        String password = req.getParameter(PASSWORD_PARAM_NAME);
        String dateOfBirth = req.getParameter(DATEOFBIRTH_PARAM_NAME);



        req.setAttribute("userName", name);
        doGet(req, resp);
    }

    public static void main(String[] args) throws ParseException {
        String date = "2020/05/02";
        SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd");
        Date parse = format.parse(date);
        System.out.println(parse);
    }
}
