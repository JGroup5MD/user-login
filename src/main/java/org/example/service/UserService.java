package org.example.service;

import org.example.DAO.UserAndRoleRegistrationDAO;
import org.example.DTO.UserDTO;
import org.example.service.API.IUserService;
import java.util.List;


public class UserService implements IUserService {

    private  final UserAndRoleRegistrationDAO dao;

    public UserService(UserAndRoleRegistrationDAO dao) {
        this.dao = dao;

    }
   @Override
    public void AllActiveUser(){
        dao.addUsers();
    }
    @Override
    public  void AllUsers(){
        dao.getAllUsers();
    }
    @Override
    public void addUsers(){
        dao.addUsers();

    }

  }




