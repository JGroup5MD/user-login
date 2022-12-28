package org.example.DTO;

import org.example.DAO.UserDAO;

import java.time.LocalDate;
import java.util.Objects;

public class UserDTOsession {
    private String login;
    private String password;
    private String FirstName;
    private String MidlName;
    private String LastName;
    private DatesDTO birthDate;
    private UserRole role;
    private LocalDate registrationDate;


    public UserDTOsession(String login, String password,
                          String firstName, String midlName,
                          String lastName, DatesDTO birthDate,
                          UserRole role, LocalDate registrationDate) {
        this.login = login;
        this.password = password;
        FirstName = firstName;
        MidlName = midlName;
        LastName = lastName;
        this.birthDate = birthDate;
        this.role = role;
        this.registrationDate = LocalDate.now();
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

    public DatesDTO getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(DatesDTO birthDate) {
        this.birthDate = birthDate;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTOsession that = (UserDTOsession) o;
        return Objects.equals(login, that.login) &&
                Objects.equals(password, that.password) &&
                Objects.equals(FirstName, that.FirstName) &&
                Objects.equals(MidlName, that.MidlName) &&
                Objects.equals(LastName, that.LastName) &&
                Objects.equals(birthDate, that.birthDate) &&
                role == that.role && Objects.equals(registrationDate, that.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, FirstName, MidlName, LastName,
                birthDate, role, registrationDate);
    }
}

