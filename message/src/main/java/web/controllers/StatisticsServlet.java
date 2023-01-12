package web.controllers;

import web.dto.StatisticsDto;
import web.service.api.IStatisticService;
import web.service.fabrics.StatisticServiceSingleton;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "StatisticsServlet", urlPatterns = "/api/admin/statistics")
public class StatisticsServlet extends HttpServlet {
    private final IStatisticService statisticServices = StatisticServiceSingleton.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("txt/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();

        StatisticsDto statistic = statisticServices.getStatistics();

        out.write("<p>" + "вы вошли в систему как адимнистратор" + "</p>");
        out.write("<p>" + "всего зарегистрировано пользователей: " + statistic.getRegisteredUsers() + "</p>");
        out.write("<p>" + "активных пользователей: " + statistic.getLoginedUsers() + "</p>");
        out.write("<p>" + "всего было отправлено сообщенией: " + statistic.getMessages() + "</p>");
    }


}
