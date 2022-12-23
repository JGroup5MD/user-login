package org.example.helpers;

import org.example.dao.UserDAO;
import org.example.dao.UserDTO;

public class idGenerator {
    private int lastID = UserDAO.getInstance().getLastID();
    public void generateID(UserDTO newUser){
        newUser.setId(lastID++);
        UserDAO.getInstance().setLastID(newUser.getId());
    }

}
