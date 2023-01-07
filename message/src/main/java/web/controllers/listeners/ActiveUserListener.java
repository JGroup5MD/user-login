package web.controllers.listeners;


import web.dto.LoginDto;
import web.dto.Role;
import web.service.api.ILoginService;
import web.service.api.IRegistrationService;

import javax.servlet.ServletContext;


import javax.servlet.http.*;
import java.util.ArrayList;
import java.util.List;


public class ActiveUserListener implements HttpSessionAttributeListener, HttpSessionListener {
    private ILoginService service;
    private Role role;
    private IRegistrationService user;

    public ActiveUserListener(){

    }


    private int ActiveUserCount=0;

    @Override
    public void attributeAdded(HttpSessionBindingEvent sbe) {
        List<LoginDto> list = new ArrayList<>();
        if(sbe.getName().equals("user")){
            service.getActiveUsers(list);
        }
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {

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
