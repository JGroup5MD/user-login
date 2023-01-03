package dto;

import java.util.List;
import java.util.Objects;

public class UserInDto {
    private String login;
    private String password;
    private List<String> loginIn;

    public UserInDto(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public UserInDto(List<String> loginIn) {
        this.loginIn = loginIn;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getLoginIn() {
        return loginIn;
    }

    public void setLoginIn(List<String> loginIn) {
        this.loginIn = loginIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInDto userInDto = (UserInDto) o;
        return Objects.equals(login, userInDto.login) && Objects.equals(password, userInDto.password) && Objects.equals(loginIn, userInDto.loginIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, loginIn);
    }

    @Override
    public String toString() {
        return "UserInDto{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", loginIn=" + loginIn +
                '}';
    }
}
