package org.example.DAO.API;

import org.example.DTO.MessageDTO;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public interface IMessageDAO {

    public List<MessageDTO> getAtSender(String sender);
    public List<MessageDTO> getAtRecipient(String recipient);
    public  List<MessageDTO> getAllmassege();
    public <MessageDTO> void addToList(List<MessageDTO> listMessage, Stream<MessageDTO> source);


}
