package web.service;

import web.dto.UserDto;
import web.service.api.IUserService;

import java.util.List;

public class UserService implements IUserService {
    @Override
    public List<UserDto> get() {
        return null;
    }

    @Override
    public boolean exists(String login) {
        return false;
    }
}
