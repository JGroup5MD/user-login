package org.example.service;

import org.example.DAO.UserDAO;
import org.example.DTO.DatesDTO;
import org.example.DTO.UserDTO;
import org.example.DTO.UserRole;
import org.example.service.API.ILoginService;

import java.util.ArrayList;
import java.util.List;

public class LoginService implements ILoginService {
    List<UserDTO>list=new ArrayList<>();
    private final UserDTO dto;
    private final UserDAO dao;


    public LoginService(UserDTO dto, UserDAO dao) {
        this.dto =dto;
        this.dao =dao;
    }
    @Override
    public void NotLogin(String login){
        if(!list.contains(login)&&login==null){
            throw new IllegalArgumentException("такого логина не существует пройлите регистраци");

        }
    }
    @Override
    public void NotPassword(String password){
        if(!list.contains(password)&&password==null){
            throw new IllegalArgumentException("такого логина не существует пройлите регистраци");
        }
    }


    @Override
    public List<UserDTO> NotUserToRegistration(String loginUser, String passwordUser){
        if(loginUser.equals(dto.getLogin())&&passwordUser.equals(dto.getPassword())){
            String login=dto.getLogin();
            String password=dto.getPassword();
            String FirstName=dto.getFirstName();
            String MidlName=dto.getMidlName();
            String LastName=dto.getLastName();
            DatesDTO birthDate=dto.getBirthDate();
            UserRole role=UserRole.user;
            dao.add(login,password,FirstName,MidlName,LastName,birthDate,role);
        }
        return list;
    }

    public String SpecificUser(String login, String password){
        if(list.contains(login)&&list.contains(password)){
           dao.Role(UserRole.user);
        }
        return (dto.getFirstName() + dto.getMidlName());
    }
}
