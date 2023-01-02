package org.example.controllers.web.listeners;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;
import java.util.Enumeration;


@WebListener
public class ActiveUserListener implements HttpSessionAttributeListener, HttpSessionListener {
    private int ActiveUserCount=0;

    @Override
    public void attributeAdded(HttpSessionBindingEvent  sbe) {
        if(sbe.getName().equals("user")){
            ISer

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
        scs.log("session with Id: " + session.getId() + " is finished");
        ActiveUserCount=0;

    }
}
