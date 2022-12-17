package org.example.controllers;

import org.example.service.API.IUserService;
import org.example.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IUserService serviceLogin = UserService.getInstance();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("txt/html; charset=UTF-8");

    }
}
