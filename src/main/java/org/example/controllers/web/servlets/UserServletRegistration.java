package org.example.controllers.web.servlets;

import org.example.DTO.UserDTO;
import org.example.DTO.UserRole;
import org.example.service.API.IUserAndRoleRegistrationService;
import org.example.service.fabrics.UserAndRoleRegistrationServiceSingleton;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet (name=" UserServletRegistration", urlPatterns = "/api/user")
public class UserServletRegistration extends HttpServlet {
    private final IUserAndRoleRegistrationService userService;

    public UserServletRegistration() {
        this.userService = UserAndRoleRegistrationServiceSingleton.getInstance();
    }
    private final String LOGIN_PARAM_NAME="login";
    private final String PASSWORD_PARAM_NAME="password";
    private final String FIRST_NAME_PARAM="firstName";
    private final String MIDL_NAME_PARAM="midlName";
    private final String LAST_NAME_PARAM="lastName";
    private final String TIME_NAME_PARAM="timeRegistration";

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

        PrintWriter out= resp.getWriter();
        String login=getValue(req,LOGIN_PARAM_NAME);
        String password=getValue(req,PASSWORD_PARAM_NAME);
        String FirstName=getValue(req,FIRST_NAME_PARAM);
        String MidlName=getValue(req,MIDL_NAME_PARAM);
        String LastName=getValue(req,LAST_NAME_PARAM);
        LocalDate birthDate= LocalDate.parse(getValue(req,TIME_NAME_PARAM));
        UserRole role;
        HttpSession session=req.getSession();

        if(login==null || password==null ||
                FirstName==null || MidlName==null ||
                LastName==null || birthDate==null){
            throw new IllegalArgumentException("Недолжно быть пустых полей");
        }
            if(login.equals("admin")&&password.equals("1A11aDMin11A1")){
                role=UserRole.admin;
            }else{
                role=UserRole.user;
            }
            UserDTO udto=new UserDTO(login,password,FirstName,MidlName,LastName,birthDate);
            userService.addUsers(udto);

            if(role==UserRole.user) {
                session.setAttribute("role", UserRole.user);
                out.write("<p>"+ FirstName +" "+MidlName+  ", Вы успешно зарегистрированы под login" + login+"</p>");
            }
    }

    }





