package dto;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class UserDto {
 private LocalDateTime dtRegistration;
 private NewUserDto user;

    public UserDto(NewUserDto user) {
        this.dtRegistration = LocalDateTime.now();
        this.user = user;
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

}
