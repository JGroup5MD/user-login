package org.example.service.API;

import org.example.DAO.MessageDAO;
import org.example.DTO.MessageDTO;

import java.util.List;

public interface IMessageService {
    public List<MessageDTO> addMessage(MessageDTO message);
    public List<MessageDTO> getAllMessage(String roleUser);
    public boolean getMessageAtRecipient(String recipient);
}
