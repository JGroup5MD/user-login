package org.example.DAO.API;

import org.example.DTO.UserAndRoleRegistration;
import org.example.DTO.UserDTO;
import org.example.DTO.UserRole;

import java.util.Map;

public interface IUserAndRoleRegistrationDAO {
    public UserDTO createdADMIN();
    public Map<Integer, UserAndRoleRegistration> addUsers(UserDTO udto);
    public Map<Integer, UserAndRoleRegistration> getAllUsers();
    public  Map<Integer, UserAndRoleRegistration> deliteAnyUser(int key) ;
    public UserAndRoleRegistration deleteUser(String login, UserAndRoleRegistration user);
    public UserRole role(String loginADMIN, String passwordADMIN, UserRole role);
    public long countALLUser(Map<Integer, UserAndRoleRegistration> userMap, long count);

}
