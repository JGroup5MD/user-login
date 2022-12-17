package org.example.dao;

import org.example.DTO.UserDTO;
import org.example.dao.API.IUserDAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class UserDAO implements IUserDAO {
    public UserDAO(List<UserDTO> users) {
        this.users = users;
    }
    List<UserDTO> users=new ArrayList<>();

    @Override
    public List<UserDTO> add() {
        users.add(new UserDTO(1, "admin", "1111", "Шадрин Илья", 1, LocalDate.now()));
    return null;
    }

    @Override
    public UserDAO mapUser(Map<Integer, List<UserDTO>> map) {
        return null;
    }

    @Override
    public UserDAO delite(int key) {

        return null;
    }


    @Override
    public List<UserDTO> get() {
        return null;
    }
}

