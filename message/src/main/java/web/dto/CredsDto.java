package web.dto;

import java.util.Arrays;

public class CredsDto {
    private String login;
    private String password;
    private String[] role;
    private int id;

    public CredsDto(String login, String password, String[] role, int id) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String[] getRole() {
        return role;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "CredsDTO{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role=" + Arrays.toString(role) +
                ", id=" + id +
                '}';
    }

    public static class UserBuilder {
        private int id;
        private String login;
        private String password;
        private String[] role;

        private UserBuilder(){
        }

        public static UserBuilder create() {
            return new UserBuilder();
        }

        public UserBuilder setId(int id) {
            this.id = id;
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

        public UserBuilder setRole(String[] role) {
            this.role = role;
            return this;
        }

        public UserBuilder addRole(String role) {
            this.role = Arrays.copyOf(this.role, this.role.length + 1);
            this.role[this.role.length - 1] = role;
            return this;
        }

        public CredsDto build() {
            return new CredsDto(login, password, role, id);
        }
    }

}
