package org.example.controllers.web.servlets;

import org.example.DAO.UserAndRoleRegistrationDAO;
import org.example.DTO.LoginDTO;
import org.example.DTO.MessageDTO;
import org.example.DTO.UserAndRoleRegistration;
import org.example.service.API.ILoginService;
import org.example.service.API.IStatisticService;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet (name="StatisticsServlet", urlPatterns = "/api/admin/statistics")
public class StatisticsServlet extends HttpServlet {
    private final IStatisticService ss;
    private final IUserAndRoleRegistrationService us;
    private final ILoginService ls;
    private  final UserAndRoleRegistrationDAO udao;
    public StatisticsServlet(IStatisticService ss,IUserAndRoleRegistrationService us,ILoginService ls,UserAndRoleRegistrationDAO udao) {
        this.ss = ss;
        this.us= UserAndRoleRegistrationServiceSingleton.getInstance();
        this.ls=ls;
        this.udao=udao;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("txt/html; charset=UTF-8");
        PrintWriter out=resp.getWriter();
        HttpSession session=req.getSession();
        List<MessageDTO> listMassage=new ArrayList<>();
        List<LoginDTO>listLogin=new ArrayList<>();
        Map<Integer, UserAndRoleRegistration> mapUser=new HashMap<>();

        String login=session.getAttribute("amin").toString();
        String password=session.getAttribute("password").toString();

        if(login.isBlank()|| password.isEmpty()){
            throw new IllegalArgumentException("введены не корректные данные");
        }
        if(login.equals(udao.createdADMIN().getLogin()) &&
                password.equals(udao.createdADMIN().getPassword()) ){
            out.write("<p>"+ "вы вошли в систему как адимнистратор" +"</p>");
            out.write("<p>"+ "всего зарегистрировано пользователей: "+ us.getAllUsers(mapUser)+"</p>");
            out.write("<p>"+ "активных пользователей: " +ls.getActiveUsers(listLogin) +"</p>");
            out.write("<p>"+ "всего было отправлено сообщенией: "+ss.getAllmassege(listMassage) +"</p>");
        }
    }
}
