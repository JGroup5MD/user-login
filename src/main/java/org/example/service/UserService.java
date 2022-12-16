package org.example.service;

import org.example.dao.UserDTO;

import java.util.Map;

public class UserService implements IUserService{
    private volatile static UserService instance;

    public void save(Map<String, String[]> map) throws Exception {
        UserDTO newUser = new UserDTO();

        String[] id = map.get("id");
        String[] login = map.get("login");
        String[] password = map.get("password");
        String[] name = map.get("name");
        String[] birthDate = map.get("birthDate");


        newUser.setId(id[0]);//+parse
        newUser.setLogin(login[0]);
        newUser.setPassword(password[0]);;
        newUser.setName(name[0]);
        newUser.setBirthDate(birthDate[0]);//+parse





    }
    public static UserService getInstance() {
        if (instance == null) {
            synchronized (UserService.class) {
                if (instance == null) {
                    instance = new UserService();
                }
            }
        }
        return instance;
    }
}
