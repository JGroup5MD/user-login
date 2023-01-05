package org.example.controllers.web.servlets;

import org.example.DTO.LoginDTO;
import org.example.DTO.UserRole;
import org.example.service.API.ILoginService;

import org.example.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet (name = "LoginServlet", urlPatterns = "/ui/signIn")
public class LoginServlet extends HttpServlet {
    private final String PARAM_LOGIN="login";
    private final String PARAM_PASSWORD="password";
    private final UserRole PARAM_ROLE= UserRole.valueOf("role");
    private final ILoginService service;
    public LoginServlet(LoginService service) {
        this.service = service;
    }

    public String getValue(HttpServletRequest req, String key){
        String param=req.getParameter(key);
        if(param==null){
            HttpSession session = req.getSession();
            if (!session.isNew()) {
                param = (String) session.getAttribute(key);
            }
        }
        if (param == null) {
            throw new IllegalArgumentException("Передайте параметры");
        }
        return param;
    }

        @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("txt/html; charset=UTF-8");
        PrintWriter out=resp.getWriter();
        HttpSession session= req.getSession();

        String login=getValue(req,PARAM_LOGIN);
        String password=getValue(req,PARAM_PASSWORD);
        List<LoginDTO> list=new ArrayList<>();

        if(login==null ) {
            throw new IllegalArgumentException("ведите логин");
        }
        if(password==null ) {
            throw new IllegalArgumentException("ведите пароль");
        }
        if(!service.markerLogin(login,list)) {
            throw new IllegalArgumentException("введите корректный логин");
        }
        if(!service.markerPassword(password,list)) {
            throw new IllegalArgumentException("введите корректный пароль");
        }
        if(service.markerLogin(login,list) && service.markerPassword(password,list)&& req.isUserInRole("admin")) {
            out.write("<p>"+", Вы успешно вошли в систему как администратор"+ "</p>");
            }
            if(service.markerPassword(password,list) && service.markerPassword(password,list)&& req.isUserInRole("user")) {
                out.write("<p>"+", Вы успешно вошли в систему"+  "</p>");
            }
        }
}

