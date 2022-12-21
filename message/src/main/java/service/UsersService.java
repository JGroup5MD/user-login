package service;

import dto.UsersDTO;
import service.api.IUserService;

import java.util.List;

public class UsersService implements IUserService {
    @Override
    public List<UsersDTO> get() {
        return null;
    }

    @Override
    public boolean exists(String name) {
        return false;
    }
}
