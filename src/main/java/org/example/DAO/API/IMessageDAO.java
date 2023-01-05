package org.example.DAO.API;

import org.example.DTO.MessageDTO;

import java.util.List;

public interface IMessageDAO {
    public List <MessageDTO> addMessage(MessageDTO message,List <MessageDTO> list);
    public List<MessageDTO> getAllmassege(List<MessageDTO> list);
    public  List<MessageDTO> getMessageForUser(MessageDTO message,String sender,List <MessageDTO> list);
    public  List<MessageDTO>  deliteMesage(MessageDTO message, String sender, String recipient, List<MessageDTO> list);
    public long countMassage(List<MessageDTO> list, long count);
}
