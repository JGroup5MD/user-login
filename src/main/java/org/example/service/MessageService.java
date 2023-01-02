package org.example.service;

import org.example.DAO.MessageDAO;
import org.example.DTO.MessageDTO;
import org.example.DTO.UserRole;
import org.example.service.API.IMessageService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class MessageService implements IMessageService {
    private  UserRole roleUser;
    List <MessageDTO> list=null;
    long countMessages=0;

    @Override
    public List<MessageDTO> addMessage(MessageDTO message) {

        String sender=message.getSender();
        String recipient= message.getRecipient();
        String messages= message.getMessage();
        LocalDateTime timeSending=LocalDateTime.now();
        list.add(new MessageDTO(sender, recipient, messages, timeSending));
        countMessages++;
        return list;
    }
    @Override
    public List<MessageDTO> getAllMessage(String roleUser){
        if(Objects.equals(UserRole.admin, roleUser)){
            return this.list;
    }
        return null;
    }
    @Override
    public boolean getMessageAtRecipient(String recipient) {
        if (recipient!=null){
            return  list.contains(recipient);
        }
        return false;
    }
}





