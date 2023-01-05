package org.example.DTO;

import java.lang.String;
import java.time.LocalDate;
import java.util.Objects;
public class UserDTO {
    private  String login;
    private  String password;
    private  String FirstName;
    private String MidlName;
    private  String LastName;
    private  LocalDate birthDate;

    public UserDTO(String login, String password, String firstName, String midlName, String lastName, LocalDate birthDate) {
        this.login = login;
        this.password = password;
        this.FirstName = firstName;
        this.MidlName = midlName;
        this.LastName = lastName;
        this.birthDate = birthDate;
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

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMidlName() {
        return MidlName;
    }

    public void setMidlName(String midlName) {
        MidlName = midlName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(login, userDTO.login) && Objects.equals(password, userDTO.password) && Objects.equals(FirstName, userDTO.FirstName) && Objects.equals(MidlName, userDTO.MidlName) && Objects.equals(LastName, userDTO.LastName) && Objects.equals(birthDate, userDTO.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, FirstName, MidlName, LastName, birthDate);
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", MidlName='" + MidlName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
