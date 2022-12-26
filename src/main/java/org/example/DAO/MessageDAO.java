package org.example.DAO;

import org.example.DAO.API.IMessageDAO;
import org.example.DTO.MessageDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageDAO implements IMessageDAO {

    private final Map<String, List<MessageDTO>> mapMassege=new HashMap<>();
    @Override
    public boolean getSender(String sender){
      return this.mapMassege.containsValue(sender);
        }
    @Override
    public boolean getRecipient(String recipient){
        return this.mapMassege.containsValue(recipient);
    }
    @Override
    public Map<String, List<MessageDTO>> getAllmassege(String login){
        return this.mapMassege;
    }
    @Override
    public void add (MessageDTO message){
        String sender=message.getSender();
        mapMassege.computeIfAbsent(sender,e-> new ArrayList());
        mapMassege.get(sender).add(message);
    }
}



