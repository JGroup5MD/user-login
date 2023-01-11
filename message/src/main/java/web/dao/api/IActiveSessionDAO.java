package web.dao.api;

import web.dto.ActiveSessionDTO;

public interface IActiveSessionDAO {
    void registerNewSession(ActiveSessionDTO newSession);
    void removeSession(String sessionID);
    int getTotalCount();

}

