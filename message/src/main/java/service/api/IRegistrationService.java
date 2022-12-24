package service.api;

import dto.NewUserDto;
import dto.UserDto;

import java.util.List;

public interface IRegistrationService {
    void save(NewUserDto user);

    List<UserDto> get();
}
