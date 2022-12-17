package org.example.dao.API;

import org.example.DTO.UserDTO;

import java.util.List;

public interface IUserDAO {
    List <UserDTO> get();
}
