package web.dto;

import java.util.Map;

public class LoginDto {
    private String login;
    private String password;

    public LoginDto(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

  //  Map<UserDto, >
}
