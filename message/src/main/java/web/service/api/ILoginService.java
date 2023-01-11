package web.service.api;
import web.dto.LoginDto;
import web.dto.UserDto;

import java.util.List;

public interface ILoginService {
    List<UserDto> get();
    boolean exist(String login);
    boolean authenticate(String password);
    public boolean getAuthorized(LoginDto creds);
    boolean isAuthorized();
    boolean isAdmin();

    UserDto deliteActiveUsers(UserDto user, String login,List<LoginDto> userLogin);

    int getActiveUsers();
}

/*
    public boolean markerLogin(String param, List<LoginDTO> userLogin);
    public boolean markerPassword(String param,List<LoginDTO> userLogin);
    public void addActiveUser(LoginDTO activeUser, String login, String password, List<LoginDTO> userLogin,long activeUsers);
    public LoginDTO getActiveUsers(List<LoginDTO> userLogin);
    public UserAndRoleRegistration deliteActiveUsers(UserAndRoleRegistration user, String login,List<LoginDTO> userLogin);
*/
