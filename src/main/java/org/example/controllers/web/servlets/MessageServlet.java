package org.example.controllers.web.servlets;

import org.example.DTO.MessageDTO;
import org.example.service.API.IMessageService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@WebServlet (name="MessageServlet",urlPatterns = "/api/message")

public class MessageServlet  extends HttpServlet {
    private final String PARAM_RECIPIENT="recipient";
    private final String PARAM_MESSAGE="message";
    private final LocalDate PARAM_TIME= LocalDate.parse("timeSending");
    private final IMessageService mService;
    private final  MessageDTO messagedto;


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

    public MessageServlet(IMessageService mService,MessageDTO messagedto) {
        this.mService=mService;
        this.messagedto=messagedto;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("txt/html; charset=UTF-8");
        PrintWriter out=resp.getWriter();

        String message=getValue(req,PARAM_MESSAGE);
        String recipient=getValue(req,PARAM_RECIPIENT);
        LocalDate timeSending= LocalDate.parse(getValue(req, String.valueOf(PARAM_TIME)));

        List<MessageDTO> list=new ArrayList<>();
        HttpSession session=req.getSession();

        if(recipient==null){
            throw new IllegalArgumentException("не указан получатель сообщения");
        }else{
        if(message==null || message.isBlank()){
            throw new IllegalArgumentException("вы пытаетесь отправить пустое сообщение");
        }
        if(!recipient.isEmpty()){
            session.setAttribute(" отправлено сообщение", mService.addMessage(messagedto,list));
        }
            out.write("<p>"+ ",было отправлено сообщение для получателя" + recipient + "время отправления сообщения: "+ timeSending +"</p>");
        }
    }
}


