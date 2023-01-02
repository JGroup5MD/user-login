package org.example.service;

import org.example.DTO.*;
import org.example.service.API.ILoginService;
import org.example.service.API.IMessageService;
import org.example.service.API.IStatisticService;
import org.example.service.API.IUserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public class StatisticsService implements IStatisticService {

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
    @Override
    public LoginDTO getActiveUsers(UserRole role){
        if(Objects.equals(role,UserRole.admin)){
        return  ls.getActiveUsers();
    }
        return  null;
    }
    @Override
    public  Map<Integer, List<MessageDTO>> getAllMessage(List<String> message){
        Map<Integer, List<MessageDTO>> mapMessage =new HashMap<>();
        if(Objects.equals(role,UserRole.admin)){
            return ms.getAllMessage(mapMessage);
    }
        return null;
    }
    @Override
    public void gettAllUsers(UserRole role){
        if(Objects.equals(role,UserRole.admin)){
        us.AllUsers();
        }
    }
    @Override
    public void addMessage(List<MessageDTO> message,long CountMessage, Integer key){
        if(Objects.equals(role,UserRole.admin)|| Objects.equals(role,UserRole.user)){
            ms.addMessage(message, CountMessage, key);
        }
    }
    @Override
    public void deliteMessage(MessageDTO message, Integer key, String sender, String recipient){
        if(Objects.equals(role,UserRole.admin)){
        ms.deliteMessage(message,key,sender,recipient);
        }
    }

    @Override
    public void  getMessageAtSender(String sender){
        if(Objects.equals(role,UserRole.admin)) {
            ms.getAtSender(sender);
        }
    }
    @Override
    public void  getMessageTaRecipient(String recipient){
        if(Objects.equals(role,UserRole.admin)){
        ms.getAtRecipient(recipient);
        }
        
    }
}



