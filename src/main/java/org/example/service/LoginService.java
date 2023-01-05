package org.example.service;

import org.example.DTO.LoginDTO;

import org.example.DTO.MessageDTO;
import org.example.DTO.UserAndRoleRegistration;
import org.example.service.API.ILoginService;

import java.util.*;

public class LoginService implements ILoginService {


    public boolean markerLogin(String param,List<LoginDTO> userLogin){
        for (LoginDTO item:userLogin)
            if (Objects.equals(item.getLogin()!=null,param!=null )){
                return true;
            }
        return false;
    }

    public boolean markerPassword(String param,List<LoginDTO> userLogin){
        for (LoginDTO item:userLogin)
            if (Objects.equals(item.getPassword()!=null,param!=null)){
                return true;
            }
        return false;
    }

    public void addActiveUser(LoginDTO activeUser, String login, String password, List<LoginDTO> userLogin,long activeUsers){
        activeUsers=0;
        if(markerLogin(login, userLogin) && markerPassword(password,userLogin)){
           userLogin.add(activeUser);
           activeUsers++;
        }
        throw new IllegalArgumentException("404, incorrect parametrs");
    }

    public LoginDTO getActiveUsers(List<LoginDTO> userLogin){
        if(userLogin.size()!=0 ){
            for (LoginDTO item : userLogin) {
                return item;
            }
        }
        return null;
    }

    public UserAndRoleRegistration deliteActiveUsers(UserAndRoleRegistration user, String login,List<LoginDTO> userLogin){
        Map<Integer,UserAndRoleRegistration> map=new HashMap<>();
        String FirstName=user.getUserDTO().getFirstName();
        String MidlName=user.getUserDTO().getMidlName();
        String LastName=user.getUserDTO().getLastName();
        String fullName=FirstName+" "+MidlName+" "+LastName;
      for(LoginDTO item: userLogin){
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





