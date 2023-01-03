package dto;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class UserDataDto {
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private LocalDateTime dateOfRegistration;

    public UserDataDto(String login, String password, String firstName, String lastName,
                       Date dateOfBirth, LocalDateTime dateOfRegistration) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfRegistration = dateOfRegistration;
//        this.roles = roles;
    }

    public UserDataDto() {

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
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDateTime getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDateTime dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDataDto that = (UserDataDto) o;
        return Objects.equals(login, that.login) && Objects.equals(password, that.password) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(dateOfRegistration, that.dateOfRegistration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, firstName, lastName, dateOfBirth, dateOfRegistration);
    }

    @Override
    public String toString() {
        return "UserDataDto{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfRegistration=" + dateOfRegistration +
                '}';
    }

    public static class UserCreate {
        private String login;
        private String password;
        private String firstName;
        private String lastName;
        private Date dateOfBirth;
        private LocalDateTime dateOfRegistration;

        private UserCreate() {
        }

        public static UserCreate create() {
            return new UserCreate();
        }

        public UserCreate setLogin(String login) {
            this.login = login;
            return this;
        }

        public UserCreate setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserCreate setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserCreate setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserCreate setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public UserCreate setDateOfRegistration(LocalDateTime dateOfRegistration) {
            this.dateOfRegistration = dateOfRegistration;
            return this;
        }

        public UserDataDto build() {
            return new UserDataDto(login, password, firstName, lastName, dateOfBirth, dateOfRegistration);
        }
    }
}
