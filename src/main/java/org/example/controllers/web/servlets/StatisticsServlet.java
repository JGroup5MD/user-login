package org.example.controllers.web.servlets;

import org.example.service.LoginService;
import org.example.service.MessageService;

import org.example.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name="StatisticsServlet", urlPatterns = "/statistic")
public class StatisticsServlet extends HttpServlet {

    private final MessageService ms;
    private final UserService us;
    private final LoginService ls;

    public StatisticsServlet(MessageService ms, UserService us, LoginService ls) {
        this.ms = ms;
        this.us = us;
        this.ls = ls;
    }

    String message;
    int alluser;
    int activeUser;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("txt/html; charset=UTF-8");
        PrintWriter out=resp.getWriter();
        message= req.getParameter("message");
        alluser= Integer.parseInt(req.getParameter("alluser"));
        activeUser=Integer.parseInt(req.getParameter("activeUser"));
        String activeUser=req.getParameter("activeUser");
        message= String.valueOf(ss.getAllMessage());
        alluser= ss.getAllUser();
        activeUser=String.valueOf(ss.addActiveUser());

        out.write("all message: "+message + " all user: "+ alluser + " active user: "+activeUser);
    }
}
