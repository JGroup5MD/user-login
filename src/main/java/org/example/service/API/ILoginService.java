package org.example.service.API;

import org.example.DTO.LoginDTO;
import org.example.DTO.UserAndRoleRegistration;

import java.util.List;

public interface ILoginService {
    public boolean markerLogin(String param, List<LoginDTO> userLogin);
    public boolean markerPassword(String param,List<LoginDTO> userLogin);
    public void addActiveUser(LoginDTO activeUser, String login, String password, List<LoginDTO> userLogin,long activeUsers);
    public LoginDTO getActiveUsers(List<LoginDTO> userLogin);
    public UserAndRoleRegistration deliteActiveUsers(UserAndRoleRegistration user, String login,List<LoginDTO> userLogin);

}
