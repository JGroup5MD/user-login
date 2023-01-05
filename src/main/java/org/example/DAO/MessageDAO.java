package org.example.DAO;

import org.example.DAO.API.IMessageDAO;
import org.example.DTO.MessageDTO;
import java.time.LocalDateTime;
import java.util.*;


public class MessageDAO implements IMessageDAO {

    @Override
    public List <MessageDTO> addMessage(MessageDTO message,List <MessageDTO> list) {
        String sender=message.getSender();
        String recipient= message.getRecipient();
        String messages= message.getMessage();
        LocalDateTime timeSending=LocalDateTime.now();
        list.add(new MessageDTO(sender, recipient, messages, timeSending));
        return list;
    }

    @Override
    public  List<MessageDTO> getAllmassege(List<MessageDTO> list) {
        Iterator<MessageDTO> iter = list.iterator();
        if (!iter.hasNext()) {
            throw new IllegalArgumentException("на данный момент нет ни одного сообщения");
        } else {
            iter.next();
            return list;
        }
    }
    @Override
        public  List<MessageDTO> getMessageForUser(MessageDTO message,String sender,List <MessageDTO> list){
            for(MessageDTO item:list) {
                if (!sender.equals(message.getSender())) {
                    return null;
                }
            }
            return list;
        }
    @Override
        public  List<MessageDTO>  deliteMesage(MessageDTO message, String sender, String recipient, List<MessageDTO> list){
            for(MessageDTO item:list){
                if(sender.equals(message.getSender())
                        ||recipient.equals(message.getRecipient())){
                    list.remove(item);
                }
            }
            return list;
        }

        public long countMassage(List<MessageDTO> list, long count){
        if (list.isEmpty()){
            count=0;
        }
        for(MessageDTO item : list){
            if (item!=null){
                count++;
            }
        }
        return count;
        }
}











