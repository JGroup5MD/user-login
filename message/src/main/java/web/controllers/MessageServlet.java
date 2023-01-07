package web.controllers;

import web.service.MessageService;
import web.service.api.IMessageService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "MessageServlet", urlPatterns = "/api/message")
public class MessageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        HttpSession session = req.getSession();

        String userID = (String) session.getAttribute("user");
        Map<String, String[]> inputParams = req.getParameterMap();

        IMessageService service = MessageService.getInstance();
        try {
            service.save(inputParams, userID);
        } catch (Exception e) {
            throw new ServletException("Ошибка введенной информации");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        IMessageService service = MessageService.getInstance();
        resp.setContentType("text/html; charset=UTF-8");
        HttpSession session = req.getSession();
        String userID = (String) session.getAttribute("user");

        PrintWriter writer = resp.getWriter();
        writer.write(service.getMessages(userID));
    }

}
