package org.example.service.API;

import org.example.DTO.LoginDTO;

public interface ILoginService {
    public boolean markerLogin(String param);
    public boolean markerPassword(String param);
    public void addActiveUser(LoginDTO activeUser, String login, String password, long activeUsers);
    public LoginDTO getActiveUsers();

}
