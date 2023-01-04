package org.example.dao;

import java.util.ArrayList;

public class ActiveSessionDAO implements IActiveSessionDAO{
    private volatile static ActiveSessionDAO instance;

    private final ArrayList<ActiveSessionDTO> sessions = new ArrayList<>();

    public void registerNewSession(ActiveSessionDTO newSession) {
        sessions.add(newSession);//проверка на наличие уже этого пользователя в активных
    }
    public void removeSession(String sessionID) {
        for(ActiveSessionDTO session : sessions){
            if(session.getSessionID().equals(sessionID)){
                sessions.remove(session);
            }
        }
    }
    public Integer getTotalCount() {
        return sessions.size();
    }

    public static ActiveSessionDAO getInstance() {
        if (instance == null) {
            synchronized (ActiveSessionDAO.class) {
                if (instance == null) {
                    instance = new ActiveSessionDAO();
                }
            }
        }
        return instance;
    }
}
