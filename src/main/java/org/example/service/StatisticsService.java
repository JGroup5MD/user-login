package org.example.service;

import org.example.DAO.UserDAO;

import org.example.DTO.LoginDTO;
import org.example.DTO.UserDTO;
import org.example.DTO.UserRole;
import org.example.service.API.ILoginService;
import org.example.service.API.IMessageService;
import org.example.service.API.IUserService;

import java.util.List;


public class StatisticsService {

    private final IMessageService ms;
    private final ILoginService ls;
    private final IUserService us;

    private  final UserRole role;

    public StatisticsService(IMessageService ms, ILoginService ls, IUserService us, UserRole role) {
        this.ms = ms;
        this.ls = ls;
        this.us = us;
        this.role = role;

    }

     public List<UserDTO> getAllUser(List<UserDTO> dto){
       return dto;
    }

    public int getActiveUser(List<UserDAO> dao, String login, String password){
        if(dao.contains(login) && dao.contains(password)){

        }
        return dao.size();
    }


    public List<String> getAllMessage(List<String> message){

        return message;
    }

    public List<UserDTO> addActiveUser(List<UserDTO> dto, String login, String password) {
        List<LoginDTO> activUser=null;
             if(dto.contains(login)&&dto.contains(password)){

             }
                return dto;
    }

    }

