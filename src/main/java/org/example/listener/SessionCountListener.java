package org.example.listener;

import org.example.dao.ActiveSessionDAO;
import org.example.dao.ActiveSessionDTO;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionCountListener implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent sessionEvent) {
        ActiveSessionDTO newSession = new ActiveSessionDTO();

        String sessionID = sessionEvent.getSession().getId();
        String userID = (String) sessionEvent.getSession().getAttribute("id");

        newSession.setSessionID(sessionID);
        newSession.setUserID(userID);

        ActiveSessionDAO.getInstance().registerNewSession(newSession);
    }

    public void sessionDestroyed(HttpSessionEvent sessionEvent) {
        String sessionID = sessionEvent.getSession().getId();
        ActiveSessionDAO.getInstance().removeSession(sessionID);


    }


}