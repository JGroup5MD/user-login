package org.example.DTO;

import java.time.LocalDate;
import java.util.Objects;

public class UserDTO {
    private int id;
    private String login;
    private String password;
    private String name;
    private LocalDate birthDate;
    private LocalDate regDate;

    public UserDTO(int id, String login, String password, String name, LocalDate birthDate, LocalDate regDate) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.birthDate = birthDate;
        this.regDate = regDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return id == userDTO.id && Objects.equals(login, userDTO.login) && Objects.equals(password, userDTO.password) && Objects.equals(name, userDTO.name) && Objects.equals(birthDate, userDTO.birthDate) && Objects.equals(regDate, userDTO.regDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, name, birthDate, regDate);
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", regDate=" + regDate +
                '}';
    }

    enum role {admin,
    user
    }

}

