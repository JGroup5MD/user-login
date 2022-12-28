package org.example.controllers.web.servlets;


import org.example.DAO.UserDAO;
import org.example.DTO.DatesDTO;
import org.example.service.API.IUserService;
import org.example.service.fabrics.UserServiceSingleton;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

import static javax.swing.UIManager.get;

@WebServlet (name="UserServlet", urlPatterns = "/user")
public class UserServletRegistration extends HttpServlet {
    private final IUserService userService;

    public UserServletRegistration() {
        this.userService = UserServiceSingleton.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("singIn");
        requestDispatcher.forward(req,resp);
        }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login=req.getParameter("login");
        String password=req.getParameter("password");
        String FirstName=req.getParameter("Fname");
        String MidlName=req.getParameter("Mname");
        String LastName=req.getParameter("Lname");
        String birthDate=req.getParameter("birthDate");
        String regDate=req.getParameter("regDate");



        HttpSession session = req.getSession();
        session.setMaxInactiveInterval(-1);

        String loginUser=(String)session.getAttribute(login);
        String nameUser=(String)session.getAttribute(FirstName+" "+MidlName+" "+LastName);
        DatesDTO regDateUser=(DatesDTO)session.getAttribute(regDate);
        PrintWriter out = resp.getWriter();

        if((boolean)session.getAttribute(null) ){
            throw new IllegalArgumentException("Для регистрации нужно заполнить каждое поле");
        }else{
            out.write("<p>" + "Добавлен новый пользователь "+ "\n" +
                    "логин: " + loginUser + "\n" +
                    "ФИО: " + nameUser +"\n" +
                    "Дата регистрации: " + regDateUser + "</p>");
        }
        super.doPost(req, resp);

        out.close();
    }
}
