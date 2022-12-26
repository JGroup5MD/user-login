package org.example.DTO;

import java.util.Objects;

public class CredentialsDTO {
    private UserDTO login;
    private UserDTO password;

    public CredentialsDTO(UserDTO login, UserDTO password) {
        this.login = login;
        this.password = password;
    }

    public UserDTO getLogin() {
        return login;
    }

    public void setLogin(UserDTO login) {
        this.login = login;
    }

    public UserDTO getPassword() {
        return password;
    }

    public void setPassword(UserDTO password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CredentialsDTO that = (CredentialsDTO) o;
        return Objects.equals(login, that.login) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "CredentialsDTO{" +
                "login=" + login +
                ", password=" + password +
                '}';
    }
}
