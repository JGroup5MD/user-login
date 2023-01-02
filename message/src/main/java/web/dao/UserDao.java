package web.dao;


import web.dao.api.IUserDao;
import web.dto.NewUserDto;
import web.dto.Role;
import web.dto.UserDto;

import java.time.LocalDateTime;
import java.util.*;

/*
* 3. При регистрации у пользователя роль Пользователь, зарегистрировать пользователя, значит сохранить данные о нем в приложении
*
* */


public class UserDao implements IUserDao {

    private List<UserDto> registeredUsers = new ArrayList<>();


    @Override
    public void save(UserDto user) {
        this.registeredUsers.add(user);
    }


    public List<UserDto> get() {
        return this.registeredUsers;

    }

    UserDto adminUser = new UserDto(new NewUserDto("Вася",
            "Ибрагимович",
            "Тяпкин",
            "1988/02/02",
            "admin",
            "123qwe"));

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

/*    public static void main(String[] args) {
        NewUserDto user = new NewUserDto("M",
                "A", "Z", "199", "masha", "123qwe");

        NewUserDto.UserBuilder builder =
                NewUserDto.UserBuilder.create()
                        .setName("M")
                        .setMiddleName("A")
                        .setLastName("Z")
                        .setDateOfBirth("1999/02/02")
                        .setLogin("login")
                        .setPassword("123qwe");

        builder.build();

        UserDto userReg = new UserDto(builder.build());
  //      System.out.println(userReg);

       UserDao userBase = new UserDao();
        userBase.save(userReg);

        userBase.get();
        System.out.println(userBase);
   //     System.out.println(userBase.get().get(1));

   //     System.out.println(userBase.getPassword());

    }*/

}
