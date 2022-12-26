package org.example.DAO.API;

import org.example.DTO.MessageDTO;

import java.util.List;
import java.util.Map;

public interface IMessageDAO {
    public boolean getSender(String sender);
    public boolean getRecipient(String recipient);
    public Map<String, List<MessageDTO>> getAllmassege(String login);
    public void add(MessageDTO message);
}
