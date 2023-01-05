package org.example.service;

import org.example.DAO.API.IUserAndRoleRegistrationDAO;
import org.example.DAO.UserAndRoleRegistrationDAO;
import org.example.DTO.UserAndRoleRegistration;
import org.example.DTO.UserDTO;
import org.example.DTO.UserRole;
import org.example.service.API.IUserAndRoleRegistrationService;

import java.util.Map;

public class UserAndRoleRegistrationService implements IUserAndRoleRegistrationService {
    private final IUserAndRoleRegistrationDAO  urdao;

    public UserAndRoleRegistrationService(IUserAndRoleRegistrationDAO urdao) {
        this.urdao = new UserAndRoleRegistrationDAO();
    }

    public UserDTO createdADMIN(){
        return this.urdao.createdADMIN();
    }
    public Map<Integer, UserAndRoleRegistration> addUsers(UserDTO udto){
        return this.urdao.addUsers(udto);
    }

    public  Map<Integer, UserAndRoleRegistration> deliteAnyUser(int key){
        return this.urdao.deliteAnyUser(key);
    }

    public UserAndRoleRegistration deleteUser(String login, UserAndRoleRegistration user){
        return this.urdao.deleteUser(login,user);
    }

    public UserRole role(String loginADMIN, String passwordADMIN, UserRole role){
        return this.urdao.role(loginADMIN,passwordADMIN,role);
    }

    public Map<Integer, UserAndRoleRegistration> getAllUsers(Map<Integer, UserAndRoleRegistration> map){
        this.urdao.getAllUsers();
       return map;
    }
}
