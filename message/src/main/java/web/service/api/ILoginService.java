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


}
