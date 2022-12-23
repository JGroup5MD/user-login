package org.example.dao;

import java.util.ArrayList;

public class UserDAO implements IUserDAO {
    private volatile static UserDAO instance;

    private final ArrayList<UserDTO> users = new ArrayList<>();

    private int lastID;

    public void registerNewUser(UserDTO newUser) {
        generateID(newUser);
        users.add(newUser);
    }

    public ArrayList<UserDTO> getAllUsers() {
        return users;
    }

    public void generateID(UserDTO newUser) {
        newUser.setId(lastID++);
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

