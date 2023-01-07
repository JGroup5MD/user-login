package web.dao;


import web.dao.api.IUserDao;
import web.dto.NewUserDto;
import web.dto.Role;
import web.dto.UserDto;

import java.time.LocalDateTime;
import java.util.*;



public class UserDao implements IUserDao {

    private List<UserDto> registeredUsers = new ArrayList<>();


    @Override
    public void save(UserDto user) {
        this.registeredUsers.add(user);
    }

    @Override
    public List<UserDto> get() {
        return this.registeredUsers;

    }

    UserDto adminUser = new UserDto(new NewUserDto("Admin",
            "Admin",
            "Admin",
            "1988/02/02",
            "admin",
            "admin"));

    public UserDao() {
        adminUser.setRole(Role.ADMIN);
        adminUser.setDtCreate(LocalDateTime.now());
        this.registeredUsers.add(0, adminUser);

    }

    @Override
    public String toString() {
        return "UserDao{" +
                "users=" + registeredUsers +
                '}';
    }



}
