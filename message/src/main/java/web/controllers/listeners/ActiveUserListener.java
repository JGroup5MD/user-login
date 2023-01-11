package web.controllers.listeners;

import web.dao.ActiveSessionDAO;
import web.dto.ActiveSessionDTO;

import javax.servlet.ServletContext;
import javax.servlet.http.*;


public class ActiveUserListener implements HttpSessionAttributeListener, HttpSessionListener {

    ActiveSessionDAO activeSession = ActiveSessionDAO.getInstance();

    public ActiveUserListener() {

    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        if (!event.getName().equals("user")) {
            return;
        }

        HttpSession session = event.getSession();
        ServletContext servletContext = session.getServletContext();
        servletContext.log("session with Id: " + session.getId() + " is stаrted");

        String sessionID = session.getId();
        String userID = (String) session.getAttribute("user");
        servletContext.log("user with Id: " + userID);

        ActiveSessionDTO newSession = new ActiveSessionDTO();
        newSession.setSessionID(sessionID);
        newSession.setUserID(userID);

        activeSession.registerNewSession(newSession);
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    public void sessionCreated(HttpSessionEvent sessionEvent) {


    }

    @Override
    public void sessionDestroyed(HttpSessionEvent sessionEvent) {
        HttpSession session = sessionEvent.getSession();
        ServletContext servletContext = session.getServletContext();
        servletContext.log("session with Id: " + session.getId() + " is finished");

        String sessionID = session.getId();
        activeSession.removeSession(sessionID);
    }
}
