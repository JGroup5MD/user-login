package org.example.service;

import org.example.DAO.MessageDAO;
import org.example.DTO.MessageDTO;
import org.example.service.API.IMessageService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MessageService implements IMessageService {
    private  MessageDAO dao;
    private  MessageDTO dto;
    List <MessageDTO> list=new ArrayList<>();

    public MessageService(IMessageService service) {

    }

    @Override
    public boolean addMessage(MessageDTO message) {
        String sender=dto.getSender();
        String recipient= dto.getRecipient();
        String messages= dto.getMessage();
        LocalDateTime timeSending=LocalDateTime.now();
        return list.add(new MessageDTO(sender,recipient,messages,timeSending));
    }
    @Override
    public List<MessageDTO> getAllMessage(List<MessageDAO> message){
        return dao.getAllmassege();
    }
    @Override
    public boolean getMessage(List<MessageDTO> message,String recipient){
        if(list.contains(recipient)){
            return message.contains(recipient);
        }
        return false;
    }
}

