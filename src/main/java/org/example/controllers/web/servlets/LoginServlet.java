package org.example.controllers.web.servlets;

import org.example.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet (name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    private final String PARAM_LOGIN="login";
    private final String PARAM_PASSWORD="password";
    private final LoginService service;

    public LoginServlet(LoginService service) {
        this.service = service;
    }
    String [] login;
    String[] password;

        @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("txt/html; charset=UTF-8");
        PrintWriter out=resp.getWriter();

        Map<String, String[]> mapLogParam=req.getParameterMap();
        login=mapLogParam.get(PARAM_LOGIN);
        password=mapLogParam.get(PARAM_PASSWORD);
        if (login==null&&!mapLogParam.containsValue(login)){
            throw new IllegalArgumentException("parametr login not entered");
        }
            if (password==null&&!mapLogParam.containsValue(password)){
                throw new IllegalArgumentException("parametr password not entered");
            }else{
                out.write("Hi, welcom" + service.SpecificUser(PARAM_LOGIN,PARAM_PASSWORD));
            }
            out.close();
        }

}

