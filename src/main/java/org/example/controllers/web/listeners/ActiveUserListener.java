package org.example.controllers.web.listeners;

import org.example.DTO.ActivUserSession;
import org.example.DTO.UserAndRoleRegistration;
import org.example.DTO.UserRole;
import org.example.service.API.IStatisticService;
import org.example.service.LoginService;
import org.example.service.UserService;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;
import java.util.Enumeration;


@WebListener
public class ActiveUserListener implements HttpSessionAttributeListener, HttpSessionListener {
    private  final IStatisticService service;
    private  final LoginService ls;
    private  final UserRole role;
    private final String login;
    private final UserAndRoleRegistration user;

    public ActiveUserListener(IStatisticService service, LoginService ls,UserRole role,String login,UserAndRoleRegistration user) {
        this.service = service;
        this.ls=ls;
        this.role=role;
        this.login=login;
        this.user=user;
    }

    private int ActiveUserCount=0;

    @Override
    public void attributeAdded(HttpSessionBindingEvent  sbe) {
        if(sbe.getName().equals("user")){
            service.getActiveUsers(role);
        }
    }
    @Override
    public void attributeRemoved(HttpSessionBindingEvent sbe) {
    }
    @Override
    public void attributeReplaced(HttpSessionBindingEvent sbe) {
    }
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session=se.getSession();
        ServletContext scs=session.getServletContext();
        ActiveUserCount++;
        scs.log("session with Id: " + session.getId() + " is stаrted");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session=se.getSession();
        ServletContext scs=session.getServletContext();
        Enumeration<String> atributNames=session.getAttributeNames();
        while(atributNames.hasMoreElements()){
            String Elements=atributNames.nextElement();
            if("user".equals(Elements)){
                ActivUserSession aus=(ActivUserSession)session.getAttribute("user");
                if (aus==null){
                    ls.deliteActiveUsers(user, login);
                }
                }
        }
        scs.log("session with Id: " + session.getId() + " is finished");
        ActiveUserCount=0;
    }
}
