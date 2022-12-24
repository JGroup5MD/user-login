package service.api;

import dto.UserDto;

import java.util.List;

public interface IUserService {
    List<UserDto> get();

    boolean exists(String name);
}
