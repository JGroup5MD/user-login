package org.example.controllers;


import org.example.DAO.UserDAO;
import org.example.DTO.DatesDTO;
import org.example.DTO.UserDTO;
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
import java.util.List;

import static javax.swing.UIManager.get;

@WebServlet (name="UserServlet", urlPatterns = "/user")
public class UserServlet extends HttpServlet {
    private final IUserService userService;

    public UserServlet() {
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
        String name=req.getParameter("name");
        String birthDate=req.getParameter("birthDate");
        String regDate=req.getParameter("regDate");

        HttpSession session = req.getSession();
        session.setMaxInactiveInterval(-1);

        String loginUser=(String)session.getAttribute(login);
        String passwordUser=(String)session.getAttribute(password);
        String nameUser=(String)session.getAttribute(name);
        DatesDTO birthDateUser=(DatesDTO)session.getAttribute(birthDate);
        DatesDTO regDateUser=(DatesDTO)session.getAttribute(regDate);
        UserDAO userADD=new UserDAO();
        userADD.getMapUser();
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
