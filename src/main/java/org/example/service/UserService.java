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

    public UserRole Role(UserRole role){
        Map<Integer, UserDTO> users=getMapUser();
        if(users.containsKey(1)){
            role=UserRole.user;
        }
        return role;
    }
}


//
//    public void save(Map<Integer, List<UserDTO>> map) throws Exception {
//        UserDTO newUser = new UserDTO();
//
//        int [] id = map.get("id");
//        String[] login = map.get("login");
//        String[] password = map.get("password");
//        String[] name = map.get("name");
//        LocalDate [] birthDate = map.get("birthDate");
//
//
//        newUser.setId(id[0]);//+parse
//        newUser.setLogin(login[0]);
//        newUser.setPassword(password[0]);;
//        newUser.setName(name[0]);
//        newUser.setBirthDate(birthDate[0]);//+parse


