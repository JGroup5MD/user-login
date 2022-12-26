package org.example.service;

import org.example.DTO.UserDTO;
import org.example.DAO.API.IUserDAO;
import org.example.DTO.UserRole;
import org.example.service.API.IUserService;

import java.util.List;
import java.util.Map;

public class UserService implements IUserService {

    private volatile static IUserDAO dao;
    @Override
    public List<UserDTO> get() {

        return this.get();
    }

    @Override
    public Map<Integer, UserDTO> getMapUser() {

        return this.getMapUser();
    }

  }




