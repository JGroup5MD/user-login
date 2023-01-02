package org.example.DAO.API;

import org.example.DTO.UserAndRoleRegistration;
import org.example.DTO.UserDTO;

import java.util.Map;

public interface IUserDAO {
    public UserDTO createdADMIN();
    public void addUsers();
    public Map<Integer, UserAndRoleRegistration> getAllUsers();
    public  void deliteAnyUser(int key);
    public UserAndRoleRegistration deleteUser(String login, UserAndRoleRegistration user);

}
