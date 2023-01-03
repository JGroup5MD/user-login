package org.example.service.API;

import org.example.DTO.LoginDTO;
import org.example.DTO.UserAndRoleRegistration;

public interface ILoginService {
    public boolean markerLogin(String param);
    public boolean markerPassword(String param);
    public void addActiveUser(LoginDTO activeUser, String login, String password, long activeUsers);
    public LoginDTO getActiveUsers();
    public UserAndRoleRegistration deliteActiveUsers(UserAndRoleRegistration user, String login);

}
