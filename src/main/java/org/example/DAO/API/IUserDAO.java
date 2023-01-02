package org.example.DAO.API;

import org.example.DTO.DatesDTO;
import org.example.DTO.UserAndRoleAndDateRegistration;
import org.example.DTO.UserDTO;
import org.example.DTO.UserRole;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface IUserDAO {
    public List<UserAndRoleAndDateRegistration> add(String login,
                                                    String password,
                                                    String FirstName,
                                                    String MidlName,
                                                    String LastName,
                                                    LocalDate dateRegistration,
                                                    UserRole role);
    public  Map<Integer, UserAndRoleAndDateRegistration> deliteUserFromMap(int key);
    public Map<Integer, UserAndRoleAndDateRegistration> getMapOfUser(Map<Integer, UserAndRoleAndDateRegistration> userMap);
    public void deleteUser(int id, String login);


}
