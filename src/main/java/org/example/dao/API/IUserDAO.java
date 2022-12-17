package org.example.dao.API;

import org.example.DTO.UserDTO;
import org.example.dao.UserDAO;

import java.util.List;
import java.util.Map;

public interface IUserDAO {
    List <UserDTO> get();
    List <UserDTO> add();
    UserDAO mapUser(Map<Integer, List<UserDTO>> map);
    UserDAO delite(int key);

}
