package org.example.controllers.web.listeners;

import org.example.DTO.LoginDTO;
import org.example.DTO.UserRole;
import org.example.service.API.ILoginService;
import org.example.service.API.IUserAndRoleRegistrationService;


import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;
import java.util.ArrayList;
import java.util.List;


@WebListener
public class ActiveUserListener implements HttpSessionAttributeListener, HttpSessionListener {
    private  final ILoginService service;
    private  final UserRole role;
    private final IUserAndRoleRegistrationService user;


    public ActiveUserListener(ILoginService service, UserRole role,String login,IUserAndRoleRegistrationService user) {
        this.service = service;
        this.role=role;
        this.user=user;

    }

    private int ActiveUserCount=0;

    @Override
    public void attributeAdded(HttpSessionBindingEvent  sbe) {
        List<LoginDTO> list = new ArrayList<>();
        if(sbe.getName().equals("user")){
            service.getActiveUsers(list);
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
        session.getAttribute("user");
        scs.log("session with Id: " + session.getId() + " is finished");
        ActiveUserCount=0;
    }
}
