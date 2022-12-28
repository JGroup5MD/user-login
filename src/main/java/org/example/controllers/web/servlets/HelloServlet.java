package org.example.controllers.web.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name="HelloServlet",urlPatterns = "/hello")

public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("txt/html; charset=UTF-8");

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("hello.jsp");
        requestDispatcher.forward(req,resp);

    }
    }

