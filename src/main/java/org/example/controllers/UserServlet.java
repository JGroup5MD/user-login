package org.example.controllers;

import org.example.service.IUserService;
import org.example.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String,String[]> inputParams = req.getParameterMap();
        resp.setContentType("text/html; charset=UTF-8");
        IUserService service = UserService.getInstance();
        try{
            service.save(inputParams);
        } catch (Exception e){
            throw new ServletException("Ошибка введенной информации");
        }
    }

}
