package org.example.dao.API;

import org.example.DTO.UserDTO;

import java.util.Map;

public interface IUserDAO {
    public void add();
    Map<Integer, UserDTO>  deliteUserFromMap(int key);
    Map<Integer, UserDTO> getMapUser();

}
