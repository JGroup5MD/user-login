package org.example.service;

import org.example.DTO.LoginDTO;

import org.example.service.API.ILoginService;

import java.util.*;

public class LoginService implements ILoginService {

    private  final List<LoginDTO> credentialsDTOS;

    public LoginService(List<LoginDTO> credentialsDTOS) {
        this.credentialsDTOS = credentialsDTOS;
    }

    public boolean markerLogin(String param){
        for (LoginDTO item:credentialsDTOS)
            if (Objects.equals(item.getLogin()!=null,param!=null )){
                return true;
            }
        return false;
    }

    public boolean markerPassword(String param){
        for (LoginDTO item:credentialsDTOS)
            if (Objects.equals(item.getPassword()!=null,param!=null)){
                return true;
            }
        return false;
    }

    public void addActiveUser(LoginDTO activeUser, String login, String password, long activeUsers){
        activeUsers=0;
        if(markerLogin(login) && markerPassword(password)){
           credentialsDTOS.add(activeUser);
           activeUsers++;
        }
        throw new IllegalArgumentException("404, incorrect parametrs");
    }

    public LoginDTO getActiveUsers(){
        if(credentialsDTOS.size()!=0 ){
            for (LoginDTO item : credentialsDTOS) {
                return item;
            }
        }
        return null;
    }

    }





