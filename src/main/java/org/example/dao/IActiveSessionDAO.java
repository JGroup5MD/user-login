package org.example.dao;

public interface IActiveSessionDAO {
    void registerNewSession(ActiveSessionDTO newSession);
    void removeSession(String sessionID);
    Integer getTotalCount();

}
