package org.example.DTO;

import java.lang.String;
import java.util.Objects;

public class UserDTO {

    private String login;
    private String password;
    private String name;
    private Dates birthDate;
    private Dates regDate;



    public UserDTO( String login, String password, String name, Dates birthDate, Dates regDate) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.birthDate = birthDate;
        this.regDate = regDate;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dates getBirthDate() {
        return birthDate;
    }

    public Dates getRegDate() {
        return regDate;
    }

    public void setBirthDate(Dates birthDate) {
        this.birthDate = birthDate;
    }

    public void setRegDate(Dates regDate) {
        this.regDate = regDate;
    }

    @Override
    public boolean equals(Object o) {


        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(login, userDTO.login) && Objects.equals(password, userDTO.password) && Objects.equals(name, userDTO.name) && Objects.equals(birthDate, userDTO.birthDate) && Objects.equals(regDate, userDTO.regDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, name, birthDate, regDate);
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", regDate=" + regDate +
                '}';
    }
}

