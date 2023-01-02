package org.example.service.API;

import org.example.DAO.MessageDAO;
import org.example.DTO.MessageDTO;

import java.util.List;
import java.util.Map;

public interface IMessageService {
    public List<MessageDTO>  addMessage(List<MessageDTO> list, long countMessage, Integer key);
    public  List<MessageDTO> getAtRecipient(String recipient);
    public List<MessageDTO> getAtSender(String sender);
    public Map<Integer, List<MessageDTO>> getAllMessage(Map<Integer, List<MessageDTO>> mapMessage);
    public List<MessageDTO> deliteMessage(MessageDTO message, Integer key, String sender, String recipient);

}
