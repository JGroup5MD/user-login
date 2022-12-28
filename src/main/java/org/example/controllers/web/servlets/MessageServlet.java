package org.example.controllers.web.servlets;

import org.example.DAO.fabrics.MassageDaoSingleton;
import org.example.DTO.MessageDTO;
import org.example.service.API.IMessageService;
import org.example.service.MessageService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet (name="MessageServlet",urlPatterns = "/message")

public class MessageServlet  extends HttpServlet {
    private final String PARAM_RECIPIENT="recipient";
    private final String PARAM_MESSAGE="message";
    String[] recipient;
    String[] message;

    private final IMessageService service;

    public MessageServlet(IMessageService service) {
        this.service = service;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("txt/html; charset=UTF-8");
        PrintWriter out=resp.getWriter();
        Map<String, String[]> mapMessage=req.getParameterMap();

        recipient=mapMessage.get(PARAM_RECIPIENT);
        message=mapMessage.get(PARAM_MESSAGE);

        if(recipient==null){
            throw new IllegalArgumentException("parametr recipient not entered");
        }
        if(message==null){
            throw new IllegalArgumentException("parametr message not entered");
        }
        MessageDTO messageDTO=new MessageDTO()

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("message.jsp");
        requestDispatcher.forward(req,resp);
    }
    }

