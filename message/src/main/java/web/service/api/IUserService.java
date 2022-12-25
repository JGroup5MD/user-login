package web.service.api;

import web.dto.UserDto;

import java.util.List;

public interface IUserService {
    List<UserDto> get();

    boolean exists(String name);
}
