package org.example.DAO;

import org.example.DAO.API.IMessageDAO;
import org.example.DTO.MessageDTO;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MessageDAO implements IMessageDAO {
    private final List <MessageDTO> list;
    public MessageDAO(List<MessageDTO> list) {
        this.list = list;
    }
    private final Map<Integer, List<MessageDTO>> mapMessage = new HashMap<>();

    @Override
    public void addMessage(MessageDTO message) {
        long countMessage=0;

        String sender=message.getSender();
        String recipient= message.getRecipient();
        String messages= message.getMessage();
        LocalDateTime timeSending=LocalDateTime.now();

        list.add(new MessageDTO(sender, recipient, messages, timeSending));

        for (Integer key : mapMessage.keySet()) {
            this.mapMessage.put(key, list);
           countMessage++;
        }
    }



    @Override
    public  List<MessageDTO> getAllmassege(){
        Iterator <MessageDTO> iter=list.iterator();
        if(!iter.hasNext()) {
            throw  new IllegalArgumentException("на данный момент нет ни одного сообщения");
        } else {
            iter.next();
            return this.list;
    }
    }

    }











