package org.example.service.API;

import org.example.DTO.LoginDTO;
import org.example.DTO.MessageDTO;
import org.example.DTO.UserRole;

import java.util.List;
import java.util.Map;

public interface IStatisticService {
    public LoginDTO getActiveUsers(UserRole role);
    public Map<Integer, List<MessageDTO>> getAllMessage(List<String> message);
    public void gettAllUsers(UserRole role);
    public void addMessage(List<MessageDTO> message, long CountMessage, Integer key);
    public void deliteMessage(MessageDTO message, Integer key, String sender, String recipient);
    public void  getMessageAtSender(String sender);
    public void  getMessageTaRecipient(String recipient);

}
