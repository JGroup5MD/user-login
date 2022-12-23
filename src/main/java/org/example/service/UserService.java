package org.example.service;

import org.example.dao.UserDAO;
import org.example.dao.UserDTO;
import org.example.helpers.DateParser;

import java.util.Map;

public class UserService implements IUserService{
    private volatile static UserService instance;

    public void save(Map<String, String[]> map) throws Exception {
        UserDTO newUser = new UserDTO();

        String[] login = map.get("login");
        String[] password = map.get("password");
        String[] name = map.get("name");
        String[] birthDate = map.get("birthDate");

        newUser.setLogin(login[0]);
        newUser.setPassword(password[0]);
        newUser.setName(name[0]);
        newUser.setBirthDate(DateParser.parseDate(birthDate[0]));

        UserDAO.getInstance().registerNewUser(newUser);

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
