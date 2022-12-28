package org.example.DAO;

import org.example.DAO.API.IMessageDAO;
import org.example.DTO.MessageDTO;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MessageDAO implements IMessageDAO {

    private final List<MessageDTO> listMessage=new ArrayList<>();
    @Override
    public List<MessageDTO> getAtSender(String sender){
        for (MessageDTO item: listMessage)
        if(listMessage.contains(sender)){
        return this.listMessage;
        }
            return getAtSender(null);
    }


    @Override
    public List<MessageDTO> getAtRecipient(String recipient) {
        for (MessageDTO item: listMessage)
        if(listMessage.contains(recipient)){
            return this.listMessage;
        }
            return getAtRecipient(null);
    }


    @Override
    public  List<MessageDTO> getAllmassege(){
        Iterator <MessageDTO> iter=listMessage.iterator();
        if(!iter.hasNext()) {
            throw  new IllegalArgumentException("на данный момент нет ни одного сообщения");
        } else {
            iter.next();
            return this.listMessage;
    }
    }

    @Override
    public <MessageDTO> void addToList(List<MessageDTO> listMessage, Stream<MessageDTO> source) {
        source.collect(Collectors.toCollection(() -> listMessage));
    }
}







