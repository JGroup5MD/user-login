package web.controllers;

import web.dao.UserDao;
import web.dto.LoginDto;
import web.dto.MessageDTO;
import web.dto.UserDto;
import web.service.api.ILoginService;
import web.service.api.IRegistrationService;
import web.service.api.IStatisticService;
import web.service.fabrics.RegistrationServiceSingleton;

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
    private final IRegistrationService us;
    private final ILoginService ls;
    private  final UserDao udao;
    public StatisticsServlet(IStatisticService ss, IRegistrationService us, ILoginService ls, UserDao udao) {
        this.ss = ss;
        this.us= RegistrationServiceSingleton.getInstance();
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
        List<LoginDto> listLogin=new ArrayList<>();
        Map<Integer, UserDto> mapUser=new HashMap<>(); //dto

         if(ls.isAdmin()){
            out.write("<p>"+ "вы вошли в систему как адимнистратор" +"</p>");
            out.write("<p>"+ "всего зарегистрировано пользователей: "+ us.get()+"</p>");
            out.write("<p>"+ "активных пользователей: " +ls.getActiveUsers(listLogin) +"</p>");
            out.write("<p>"+ "всего было отправлено сообщенией: "+ss.countMassage(listMassage) +"</p>");
        }
    }
}
