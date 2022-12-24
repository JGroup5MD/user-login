package dao;


import appuser.UserAccount;
import dao.api.IUserDao;
import dto.UserDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDao implements IUserDao {

    private static final Map<String, UserAccount> mapUser = new HashMap<>();

    private List<UserDto> usersDto = new ArrayList<>();

    @Override
    public void save(UserDto user) {
        this.usersDto.add(user);
    }

    @Override
    public List<UserDto> get() {
        return this.usersDto;
    }

}
