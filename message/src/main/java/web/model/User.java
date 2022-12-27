package web.model;

/*
* Simple JavaBean object that represents a User
* */

public class User {

    private Long id;
    private String username;
    private String password;
    transient private String confirmPass;
    private Role role;

    public User(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
       this.password = password;
    }


    public String getConfirmPass() {
        return confirmPass;
    }

    public void setConfirmPass(String confirmPass) {
        this.confirmPass = confirmPass;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", confirmPass='" + confirmPass + '\'' +
                ", roles=" + role +
                '}';
    }



    private class getPassBytes {
        byte[] bpass = password.getBytes();
    }
}
