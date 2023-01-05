package org.example.service.API;

import org.example.DAO.MessageDAO;
import org.example.DTO.MessageDTO;

import java.util.List;
import java.util.Map;

public interface IMessageService {
    public List <MessageDTO> addMessage(MessageDTO message, List<MessageDTO> list);
    public  List<MessageDTO> getAllmassege(List<MessageDTO> list);
    public  List<MessageDTO> getMessageForUser(MessageDTO message,String sender,List <MessageDTO> list);
    public  List<MessageDTO>  deliteMesage(MessageDTO message, String sender, String recipient, List<MessageDTO> list);
    public long countMassage(List<MessageDTO> list, long count);
//    public List<MessageDTO>  addMessage(List<MessageDTO> list, long countMessage, Integer key);
//    public  List<MessageDTO> getAtRecipient(String recipient);
//    public List<MessageDTO> getAtSender(String sender);
//    public Map<Integer, List<MessageDTO>> getAllMessage(Map<Integer, List<MessageDTO>> mapMessage);
//    public List<MessageDTO> deliteMessage(MessageDTO message, Integer key, String sender, String recipient);


}
