package org.example.service;

import org.example.DTO.MessageDTO;
import org.example.service.API.IMessageService;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class MessageService implements IMessageService {
    Map<Integer, List<MessageDTO>> map=new ConcurrentHashMap<>();
    private final List<MessageDTO> list;

    public MessageService(List<MessageDTO> list) {
        this.list = list;
    }
    @Override
    public List<MessageDTO>  addMessage(List<MessageDTO> list, long countMessage, Integer key) {
        return map.put(key,list);
    }
    @Override
    public  List<MessageDTO> getAtRecipient(String recipient) {
        for(MessageDTO item:list){
            if(item.getRecipient().equals(recipient)){
                return this.list;
            }
        }
        throw new IllegalArgumentException("адрес данного получателя нет ни одного сообщения");
    }
    @Override
    public List<MessageDTO> getAtSender(String sender){
        for(MessageDTO item:list){
            if(item.getSender().equals(sender)){
                return this.list;
            }
        }
        throw new IllegalArgumentException("от данного отправителя  нет ни одного сообщения");
    }
    @Override
    public Map<Integer, List<MessageDTO>> getAllMessage(Map<Integer, List<MessageDTO>> mapMessage){
        mapMessage.size();
        return mapMessage;
    }

    @Override
    public List<MessageDTO> deliteMessage(MessageDTO message, Integer key, String sender, String recipient){
        map.remove(key);
       for( Map.Entry<Integer, List<MessageDTO>> item: map.entrySet()){
           if(Objects.equals(sender!=null, message.getSender()!=null)){
               return map.remove(item.getKey());
           }
        }
        for( Map.Entry<Integer, List<MessageDTO>> item: map.entrySet()){
            if(Objects.equals(recipient!=null, message.getRecipient()!=null)){
                return map.remove(item.getKey());
            }
    }
        throw new IllegalArgumentException("такого отправителя или получателя среди зарегистрированных пользователей не найдено");
    }
}





