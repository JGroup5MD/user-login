package org.example.controllers.admin;

import org.example.service.IStatisticsService;
import org.example.service.StatisticsService;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class StatisticsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        IStatisticsService service = StatisticsService.getInstance();
        resp.setContentType("text/html; charset=UTF-8");
        HttpSession session = req.getSession(); //проверка на админа
        String userID = (String) session.getAttribute("id");

        PrintWriter writer = resp.getWriter();
        writer.write(service.getStatistics());
    }
}
