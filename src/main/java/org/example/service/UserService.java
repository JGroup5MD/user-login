package org.example.service;

import org.example.DTO.UserDTO;
import org.example.DAO.API.IUserDAO;
import org.example.DTO.UserRole;
import org.example.service.API.IUserService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserService implements IUserService {

    private volatile static IUserDAO dao;
    @Override
    public List<UserDTO> get(List<UserDTO> list) {
        if(list.size()!=0){
        return this.get(list);
        }
        return null;
    }


    @Override
    public Map<Integer, UserDTO> getMapUser(Map<Integer, UserDTO> map) {

        return this.getMapUser(map);
    }

  }




