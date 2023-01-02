package org.example.controllers.web.servlets;

import org.example.DAO.API.IMessageDAO;
import org.example.DAO.API.IUserDAO;
import org.example.DAO.MessageDAO;
import org.example.DAO.UserDAO;
import org.example.DTO.ActivUserSession;

import org.example.DTO.MessageDTO;
import org.example.service.CredentialsService;
import org.example.service.StatisticsService;
import org.example.service.fabrics.StatisticServiceSingleton;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet (name="StatisticsServlet", urlPatterns = "/statistic")
public class StatisticsServlet extends HttpServlet {

    private final StatisticsService ss;
    private final CredentialsService cs;
    public StatisticsServlet(StatisticsService ss, CredentialsService cs) {
        this.ss = ss;
        this.cs = cs;
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
