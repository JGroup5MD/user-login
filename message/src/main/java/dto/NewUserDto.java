package dto;

import java.text.SimpleDateFormat;
import java.util.Arrays;

public class NewUserDto {
    private String name;
    private String middlename;
    private String lastname;
    private SimpleDateFormat dateOfBirht;
    private SimpleDateFormat dateOfRegistration;
    private String login;
    private String password;
    private String[] roles;
    private int id;


    public NewUserDto(int id, String name, String middlename,
                      String lastname, SimpleDateFormat dateOfBirht, String login,
                      String password, String[] roles,
                      SimpleDateFormat dateOfRegistration) {
        this.name = name;
        this.middlename = middlename;
        this.lastname = lastname;
        this.dateOfBirht = dateOfBirht;
        this.dateOfRegistration = dateOfRegistration;
        this.login = login;
        this.password = password;
        this.roles = roles;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public SimpleDateFormat getDateOfBirht() {
        return dateOfBirht;
    }

    public void setDateOfBirht(SimpleDateFormat dateOfBirht) {
        this.dateOfBirht = dateOfBirht;
    }

    public SimpleDateFormat getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(SimpleDateFormat dateOfRegistration) {
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
        this.password = password;
    }

    public String[] getroles() {
        return this.roles;
    }

    public void setroles(String[] roles) {
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static class UserBuilder {
        private String name;
        private String middlename;
        private String lastname;
        private SimpleDateFormat dateOfBirht;
        private SimpleDateFormat dateOfRegistration;
        private String login;
        private String password;
        private String[] roles;
        private int id;



        private UserBuilder(){
        }

        public static UserBuilder create() {
            return new UserBuilder();
        }


        public UserBuilder setId(int id) {
            this.id = id;
            return this;
        }
        
        public UserBuilder setName(String name) {
            this.name = name;
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

        public UserBuilder setRoles(String[] roles) {
            this.roles = roles;
            return this;
        }

        public UserBuilder addRole(String role) {
            this.roles = Arrays.copyOf(this.roles, this.roles.length + 1);
            this.roles[this.roles.length - 1] = role;
            return this;
        }

        public NewUserDto build() {
            return new NewUserDto(id, name, middlename, lastname, dateOfBirht, login,
                    password, roles, dateOfRegistration);
        }
    }


}
