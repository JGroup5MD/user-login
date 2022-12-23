package org.example.dao;

import java.util.ArrayList;

public interface IUserDAO {
    public void register(UserDTO newUser);
    public int getLastID();
    public void setLastID(int newLastID);
    public ArrayList<UserDTO> getAllUsers();
}
