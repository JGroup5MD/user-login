package org.example.service;

import org.example.DTO.*;
import org.example.service.API.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;


public class StatisticsService implements IStatisticService {

    private final IMessageService ms;
    private final ILoginService ls;
    private final IUserAndRoleRegistrationService iurs;
    private  final UserRole role;

    public StatisticsService(IMessageService ms, ILoginService ls, IUserAndRoleRegistrationService iurs,UserRole role) {
        this.ms = ms;
        this.ls = ls;
        this.iurs=iurs;
        this.role = role;
    }
    public void getAllUsers(Map<Integer, UserAndRoleRegistration> map){
        this.iurs.getAllUsers(map);
    }
    public UserAndRoleRegistration deleteUser(String login, UserAndRoleRegistration user){
        return this.iurs.deleteUser(login,user);
    }

    public void getActiveUsers(UserRole role, List<LoginDTO> userLogin){
        if(Objects.equals(role,UserRole.admin)){
            this.ls.getActiveUsers(userLogin);
    }
    }

    public UserAndRoleRegistration deliteActiveUsers(UserAndRoleRegistration user, String login,List<LoginDTO> userLogin){
        if(Objects.equals(role,UserRole.admin)){
            return this.ls.deliteActiveUsers(user,login,userLogin);
        }
        return null;
    }
    public List <MessageDTO> addMessage(MessageDTO message, List<MessageDTO> list){
        if(Objects.equals(role,UserRole.admin)||Objects.equals(role,UserRole.user)){
            return this.ms.addMessage(message,list);
        }
        return null;
    }

    public  List <MessageDTO>   getAllmassege(List<MessageDTO> list){
       if(Objects.equals(role,UserRole.admin)){
           return this.ms.getAllmassege(list);
    }
       return null;
    }

    public  List<MessageDTO> getMessageForUser(MessageDTO message,String sender,List <MessageDTO> list){
        if(Objects.equals(role,UserRole.admin)||Objects.equals(role,UserRole.user)){
            return this.ms.getMessageForUser(message,sender,list);
        }
        return null;
    }

    public long countMassage(List<MessageDTO> list, long count){
        if(Objects.equals(role,UserRole.admin)){
            return this.ms.countMassage(list,count);
    }
        return count;
    }

    public void gettAllUsers(UserRole role, Map<Integer, UserAndRoleRegistration> map){
        if(Objects.equals(role,UserRole.admin)){
            iurs.getAllUsers(map);
        }
    }
}
//    @Override
//    public  Map<Integer, List<MessageDTO>> getAllMessage(List<String> message){
//        Map<Integer, List<MessageDTO>> mapMessage =new HashMap<>();
//        if(Objects.equals(role,UserRole.admin)){
//            return ms.getAllMessage(mapMessage);
//    }
//        return null;
//    }
//    @Override
//    public void addMessage(List<MessageDTO> message,long CountMessage, Integer key){
//        if(Objects.equals(role,UserRole.admin)|| Objects.equals(role,UserRole.user)){
//            ms.addMessage(message, CountMessage, key);
//        }
//    }
//    @Override
//    public void deliteMessage(MessageDTO message, Integer key, String sender, String recipient){
//        if(Objects.equals(role,UserRole.admin)){
//        ms.deliteMessage(message,key,sender,recipient);
//        }
//    }
//
//    @Override
//    public void  getMessageAtSender(String sender){
//        if(Objects.equals(role,UserRole.admin)) {
//            ms.getAtSender(sender);
//        }
//    }
//    @Override
//    public void  getMessageTaRecipient(String recipient){
//        if(Objects.equals(role,UserRole.admin)){
//        ms.getAtRecipient(recipient);
//        }






