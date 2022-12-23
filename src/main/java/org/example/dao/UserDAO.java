package org.example.dao;

import java.util.ArrayList;

public class UserDAO {
    private volatile static UserDAO instance;

    private ArrayList<UserDTO> users = new ArrayList<>();

    public void register(UserDTO newUser) {
        users.add(newUser);
    }

    public ArrayList<UserDTO> getAll() {
        return users;
    }

    public static UserDAO getInstance() {
        if (instance == null) {
            synchronized (UserDAO.class) {
                if (instance == null) {
                    instance = new UserDAO();
                }
            }
        }
        return instance;
    }
}

