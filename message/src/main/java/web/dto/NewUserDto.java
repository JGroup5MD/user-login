package web.dto;

import web.service.PassEncBase;

import java.util.Date;

/*
* 1. Сущность Пользователь имеет следующие поля
Логин
Пароль
ФИО
Дата рождения
Дата регистрации
Роль (Пользователь\Админ)
* */
public class NewUserDto {
    private String name;
    private String middleName;
    private String lastName;
    private String dateOfBirht;

    private String login;
    private String password;

    private Role role;
    private Date dateOfRegistration;
    private static String salt = PassEncBase.getSaltvalue(5);




    public NewUserDto(String name, String middleName,
                      String lastName, String dateOfBirht, String login,
                      String password) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirht = dateOfBirht;

        this.login = login;
        this.password = PassEncBase.generateSecurePassword(password, salt);

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirht() {
        return dateOfBirht;
    }

    public void setDateOfBirht(String dateOfBirht) {
        this.dateOfBirht = dateOfBirht;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
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
        this.password = PassEncBase.generateSecurePassword(password, salt);
    }

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getSalt() {
        return salt;
    }

    public static class UserBuilder {
        private String name;
        private String middleName;
        private String lastName;
        private String dateOfBirht;
        private String login;
        private String password;


        private UserBuilder(){
        }

        public static UserBuilder create() {
            return new UserBuilder();
        }


        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setMiddleName(String middleName){
            this.middleName = middleName;
            return this;
        }

        public UserBuilder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setLogin(String login) {
            this.login = login;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = PassEncBase.generateSecurePassword(password, salt);
            return this;
        }

        public UserBuilder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirht = dateOfBirth;
            return this;
        }

        public UserBuilder addDateOfBirth(String dateOfBirth) {
            this.dateOfBirht = dateOfBirth;
            return this;
        }

        public NewUserDto build() {
            return new NewUserDto(name, middleName, lastName, dateOfBirht, login,
                    password);
        }

        @Override
        public String toString() {
            return "UserBuilder{" +
                    "name='" + name + '\'' +
                    ", middleName='" + middleName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", dateOfBirht='" + dateOfBirht + '\'' +
                    ", login='" + login + '\'' +
                    ", password='" + password + '\'' +
                    ", salt='" + salt + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "NewUserDto{" +
                "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirht=" + dateOfBirht +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }
}
