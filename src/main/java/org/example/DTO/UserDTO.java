package org.example.DTO;

import java.lang.String;
import java.time.LocalDate;
import java.util.Objects;
public class UserDTO {
    private String login;
    private String password;
    private String FirstName;
    private String MidlName;
    private String LastName;
    private DatesDTO birthDate;
    private UserRole role;

    public UserDTO(String login, String password,
                   String firstName, String midlName,
                   String lastName, DatesDTO birthDate) {
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

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getMidlName() {
        return MidlName;
    }

    public String getLastName() {
        return LastName;
    }

    public DatesDTO getBirthDate() {
        return birthDate;
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

    public static String  model(UserDTO user){
        String login= user.login;
        String password= user.password;
        String firstName= user.FirstName;
        String midlName= user.MidlName;
        String lastName= user.LastName;
        DatesDTO birthDate= user.birthDate;
        UserRole role=user.role;
        return login + ", " + password + ", " + firstName + ", "
               + midlName + ", " + lastName + ", " + birthDate + ", " + role;
  }

    @Override
    public String

    toString() {
        return "UserDTO{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", MidlName='" + MidlName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", birthDate=" + birthDate +
                ", role=" + role +
                '}';
    }

    public static  class  UserBuilder{
        private String login;
        private String password;
        private String FirstName;
        private String MidlName;
        private String LastName;
        private DatesDTO birthDate;
        private LocalDate registrationhDate;
        private UserRole role;

        public UserBuilder setRegistrationhDate(LocalDate registrationhDate) {
            this.registrationhDate = registrationhDate;
            return  this;
        }

        public   UserDTO build(){
            return new UserDTO(login,password,FirstName,MidlName,LastName,birthDate);
        }

        public UserBuilder setLogin(String login) {
            this.login = login;
            return  this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return  this;
        }

        public UserBuilder setFirstName(String firstName) {
            FirstName = firstName;
            return  this;
        }

        public UserBuilder setMidlName(String midlName) {
            MidlName = midlName;
            return  this;
        }

        public UserBuilder setLastName(String admin) {
            LastName = LastName;
            return  this;
        }

        public UserBuilder setBirthDate(DatesDTO birthDate) {
            this.birthDate = birthDate;
            return  this;
        }

        public UserBuilder setRole(UserRole role) {
            this.role = role;
            return this;
        }
    }
}

