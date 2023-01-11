package web.controllers;

import web.dao.MessageDAO;
import web.dto.MessageDTO;
import web.service.MessageService;
import web.service.api.IMessageService;
import web.service.fabrics.MessageServiceSingleton;

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

    private static final String RECEIVER_PARAM_NAME = "receiver";
    private static final String MESSAGE_BODY_PARAM = "text";

    private final IMessageService service;

    public MessageServlet() {
        this.service = MessageServiceSingleton.getInstance();
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        HttpSession session = req.getSession();

        String sender = (String) session.getAttribute("user");
        String receiver = req.getParameter(RECEIVER_PARAM_NAME);
        String text = req.getParameter(MESSAGE_BODY_PARAM);

        MessageDTO message = new MessageDTO(sender, receiver, text);
        try {
            service.save(message);
        } catch (Exception e) {
            throw new ServletException("Ошибка введенной информации");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.setContentType("text/html; charset=UTF-8");
        HttpSession session = req.getSession();
        String userID = (String) session.getAttribute("user");

        PrintWriter writer = resp.getWriter();
        writer.write(service.getMessages(userID));
    }

}
