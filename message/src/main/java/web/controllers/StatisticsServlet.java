package web.controllers;

import web.dao.UserDao;
import web.dto.LoginDto;
import web.dto.MessageDTO;
import web.dto.UserDto;
import web.service.StatisticsService;
import web.service.api.ILoginService;
import web.service.api.IRegistrationService;
import web.service.api.IStatisticService;
import web.service.fabrics.RegistrationServiceSingleton;
import web.service.fabrics.StatisticServiceSingleton;

import javax.servlet.ServletConfig;
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
    private IStatisticService ss;
    private IRegistrationService us;
    private ILoginService ls;

    public StatisticsServlet() {
        this.ss = StatisticServiceSingleton.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("txt/html; charset=UTF-8");
        PrintWriter out=resp.getWriter();
        HttpSession session=req.getSession();

        List<MessageDTO> listMassage=new ArrayList<>();


         if(session.getAttribute("user").equals("admin")){
            out.write("<p>"+ "вы вошли в систему как адимнистратор" +"</p>");
            out.write("<p>"+ "всего зарегистрировано пользователей: "+ us.get()+"</p>");
            out.write("<p>"+ "активных пользователей: " + ls.get() +"</p>");
            out.write("<p>"+ "всего было отправлено сообщенией: "+ss.countMassage(listMassage) +"</p>");
        }

    }






}
