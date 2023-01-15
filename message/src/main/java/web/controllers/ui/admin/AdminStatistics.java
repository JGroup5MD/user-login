package web.controllers.ui.admin;

import web.service.api.IStatisticService;
import web.service.fabrics.StatisticServiceSingleton;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name="AdminStatistics", urlPatterns = "/ui/admin/statistics")
public class AdminStatistics extends HttpServlet {
    private final IStatisticService service;

    public AdminStatistics() {
        service = StatisticServiceSingleton.getInstance();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        req.setAttribute("AllUsers", service.getStatistics().getRegisteredUsers());
        req.setAttribute("OnlineUsers", service.getStatistics().getLoginedUsers());
        req.setAttribute("MessageCount", service.getStatistics().getMessages());
        req.getRequestDispatcher("/views/ui/admin/statistic.jsp").forward(req, resp);
    }
}
