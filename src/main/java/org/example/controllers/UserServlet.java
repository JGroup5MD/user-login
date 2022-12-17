package org.example.controllers;

import org.example.service.API.IUserService;
import org.example.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
@WebServlet (name="UserServlet", urlPatterns = "/user")
public class UserServlet extends HttpServlet {
    private final IUserService userService;

    public UserServlet(){
        this.userService =UserService.getInstance();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String,String[]> inputParams = req.getParameterMap();
        resp.setContentType("text/html; charset=UTF-8");

        IUserService serviceUser = UserService.getInstance();
        try{
            serviceUser.save(inputParams);
        } catch (Exception e){
            throw new ServletException("Ошибка введенной информации");
        }
        PrintWriter out=resp.getWriter();

    }


}
