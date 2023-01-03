package org.example.service;

import org.example.DTO.LoginDTO;

import org.example.DTO.UserAndRoleRegistration;
import org.example.service.API.ILoginService;
import org.example.service.API.IUserService;

import java.util.*;

public class LoginService implements ILoginService {

    private  final List<LoginDTO> credentialsDTOS;

    public LoginService(List<LoginDTO> credentialsDTOS) {
        this.credentialsDTOS = credentialsDTOS;
    }

    Map<Integer,UserAndRoleRegistration> map=new HashMap<>();


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
    @Override
    public UserAndRoleRegistration deliteActiveUsers(UserAndRoleRegistration user, String login){
        String FirstName=user.getUserDTO().getFirstName();
        String MidlName=user.getUserDTO().getMidlName();
        String LastName=user.getUserDTO().getLastName();
        String fullName=FirstName+" "+MidlName+" "+LastName;
      for(LoginDTO item: credentialsDTOS){
          if(item.getLogin().equals(login)){
              map.values().removeIf(a -> a.getUserDTO().getLogin().equals(login));
              for(Map.Entry<Integer,UserAndRoleRegistration> i:map.entrySet()){
                  if(fullName.equals((i.getValue().getUserDTO().getFirstName())+" "+
                          (i.getValue().getUserDTO().getMidlName())+" "+(i.getValue().getUserDTO().getLastName()))){
                      return map.remove(i.getKey());
                  }
              }
          }
      }
        return null;
    }
}





