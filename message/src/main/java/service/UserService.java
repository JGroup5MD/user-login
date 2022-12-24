package service;

import dto.UserDto;
import service.api.IUserService;

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
