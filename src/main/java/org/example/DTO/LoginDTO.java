package org.example.DTO;

import java.util.Objects;

public class LoginDTO {
    private UserDTO loginIn;
    private UserDTO passwordIn;

    public LoginDTO(UserDTO loginIn, UserDTO passwordIn) {
        this.loginIn = loginIn;
        this.passwordIn = passwordIn;
    }

    public UserDTO getLogin() {
        return loginIn;
    }

    public void setLogin(UserDTO loginIn) {
        this.loginIn = loginIn;
    }

    public UserDTO getPassword() {
        return passwordIn;
    }

    public void setPassword(UserDTO passwordIn) {
        this.passwordIn = passwordIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginDTO that = (LoginDTO) o;
        return Objects.equals(loginIn, that.loginIn) && Objects.equals(passwordIn, that.passwordIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginIn, passwordIn);
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "loginIn=" + loginIn +
                ", passwordIn=" + passwordIn +
                '}';
    }
}
