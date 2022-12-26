package org.example.DAO.API;

import org.example.DTO.DatesDTO;
import org.example.DTO.UserDTO;
import org.example.DTO.UserRole;

import java.util.List;
import java.util.Map;

public interface IUserDAO {
    public List<UserDTO> add(String login,
                             String password,
                             String FirstName,
                             String MidlName,
                             String LastName,
                             DatesDTO birthDate,
                             UserRole role);
    public  Map<Integer, UserDTO.UserBuilder> deliteUserFromMap(int key);
    public Map<Integer, UserDTO.UserBuilder> getMapOfUser(Map<Integer, UserDTO.UserBuilder> userMap);
    public void deleteUser(int id, String login);

}
