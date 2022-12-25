package web.dto;

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
    private Date dateOfBirht;
  //  private Date dateOfRegistration;
    private String login;
    private String password;
 //   private String[] roles;



    public NewUserDto(String name, String middleName,
                      String lastName, Date dateOfBirht, String login,
                      String password) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirht = dateOfBirht;
    //    this.dateOfRegistration = dateOfRegistration;
        this.login = login;
        this.password = password;
    //    this.roles = roles;
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

    public Date getDateOfBirht() {
        return dateOfBirht;
    }

    public void setDateOfBirht(Date dateOfBirht) {
        this.dateOfBirht = dateOfBirht;
    }

 /*   public SimpleDateFormat getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }*/

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

/*    public String[] getroles() {
        return this.roles;
    }

    public void setroles(String[] roles) {
        this.roles = roles;
    }*/


    public static class UserBuilder {
        private String name;
        private String middleName;
        private String lastName;
        private Date dateOfBirht;
  //      private Date dateOfRegistration;
        private String login;
        private String password;
    //    private String[] roles;




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
            this.password = password;
            return this;
        }
/*
        public UserBuilder setRoles(String[] roles) {
            this.roles = roles;
            return this;
        }

        public UserBuilder addRole(String role) {
            this.roles = Arrays.copyOf(this.roles, this.roles.length + 1);
            this.roles[this.roles.length - 1] = role;
            return this;
        } */

        public UserBuilder setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirht = dateOfBirth;
            return this;
        }

        public UserBuilder addDateOfBirth(Date dateOfBirth) {
            this.dateOfBirht = dateOfBirth;
            return this;
        }

        public NewUserDto build() {
            return new NewUserDto(name, middleName, lastName, dateOfBirht, login,
                    password);
        }
    }


}
