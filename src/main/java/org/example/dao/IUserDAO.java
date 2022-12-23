package org.example.dao;

import java.util.ArrayList;

public interface IUserDAO {
    public void registerNewUser(UserDTO newUser);
    public ArrayList<UserDTO> getAllUsers();
}
