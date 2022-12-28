package web.dao;


import web.dao.api.IUserDao;
import web.dto.NewUserDto;
import web.dto.Role;
import web.dto.UserDto;
import web.service.PassEncBase;
import web.service.UserService;

import java.time.LocalDateTime;
import java.util.*;

/*
* 3. При регистрации у пользователя роль Пользователь, зарегистрировать пользователя, значит сохранить данные о нем в приложении
*
* */


public class UserDao implements IUserDao {

    private List<UserDto> users = new ArrayList<>();

    public UserDao(List<UserDto> users) {
        this.users = users;
    }

    @Override
    public void save(UserDto user) {
        this.users.add(user);
    }

    @Override
    public List<UserDto> get() {
        return this.users;
    }

    UserDto adminUser = new UserDto(new NewUserDto("Вася",
            "Ибрагимович",
            "Тяпкин",
            "1988/02/02",
            "admin",
            "iJAaAd4uz7L2ynDFpqRAJiWyu8QD5BdpHp/getJjlBo="));

    public UserDao() {
        adminUser.setRole(Role.ADMIN);
        adminUser.setDtCreate(LocalDateTime.now());
        this.users.add(0, adminUser);

    }



    @Override
    public String toString() {
        return "UserDao{" +
                "users=" + users +
                '}';
    }

}
