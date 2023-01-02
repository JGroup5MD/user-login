package org.example.DAO.API;

import org.example.DTO.MessageDTO;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public interface IMessageDAO {
    public void addMessage(MessageDTO message);
    public  List<MessageDTO> getAllmassege();
}
