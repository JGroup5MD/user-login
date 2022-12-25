package web.service.api;

import web.dto.NewUserDto;
import web.dto.UserDto;

import java.util.List;

public interface IRegistrationService {
    void save(NewUserDto user);

    List<UserDto> get();
}
