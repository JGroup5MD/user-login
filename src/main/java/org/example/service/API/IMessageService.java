package org.example.service.API;

import org.example.DAO.MessageDAO;
import org.example.DTO.MessageDTO;

import java.util.List;

public interface IMessageService {
    public boolean addMessage(MessageDTO message);
    public List<MessageDTO> getAllMessage(List<MessageDAO> message);
    public boolean getMessage(List<MessageDTO> message,String recipient);
}
