package web.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/*
* В этом packedge ничто не относится к ДЗ и относится к свободнопу полету фантазии, может быть в последствии перекачующее
* */
public class UserDto {
 private LocalDateTime dtRegistration;
 private NewUserDto user;
 private int id;

 List<String> role = new ArrayList<>();

    public UserDto(NewUserDto user) {
        this.id = id;
        this.dtRegistration = LocalDateTime.now();
        this.user = user;
        this.role = role;
    }

    public LocalDateTime getDtRegistration(){
        return dtRegistration;
    }

    public void setDtRegistration(LocalDateTime dtRegistration) {
        this.dtRegistration = dtRegistration;
    }

    public NewUserDto getUser() {
        return user;
    }

    public void setUser(NewUserDto user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getRole() {
        return role;
    }

    public void setRole(List<String> role) {
        this.role = role;
    }

    public static void main(String[] args) {
        NewUserDto userNew = new NewUserDto("Nmae", "Middd", "Las", "lasvegas", "123qwe");
        UserDto user = new UserDto(userNew);

        System.out.println(userNew.toString());
    }

}
