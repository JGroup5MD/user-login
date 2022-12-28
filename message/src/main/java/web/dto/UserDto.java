package web.dto;

import java.time.LocalDateTime;

public class UserDto {
    private LocalDateTime dtCreate;
    private Role role;
    private NewUserDto newUserDto;

    public UserDto(NewUserDto newUserDto) {
        this.dtCreate = LocalDateTime.now();
        this.role = Role.USER;
        this.newUserDto = newUserDto;
    }

    public LocalDateTime getDtCreate() {
        return dtCreate;
    }

    public void setDtCreate(LocalDateTime dtCreate) {
        this.dtCreate = dtCreate;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public NewUserDto getNewUserDto() {
        return newUserDto;
    }

    public void setNewUserDto(NewUserDto newUserDto) {
        this.newUserDto = newUserDto;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "dtCreate=" + dtCreate +
                ", role=" + role +
                ", newUserDto=" + newUserDto +
                '}';
    }
}
