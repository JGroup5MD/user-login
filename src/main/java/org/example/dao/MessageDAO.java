package org.example.dao;

import java.util.ArrayList;
import java.util.Date;



public class MessageDAO implements IMessageDAO{
    private volatile static MessageDAO instance;

    private final ArrayList<MessageDTO> messages = new ArrayList<>();

    private int lastID;
    public void registerNewMessage(MessageDTO newMessage) {
        generateID(newMessage);
        newMessage.setDate(new Date());
        messages.add(newMessage);
    }


    public Integer getTotalCount() {
        return messages.size();
    }

    public ArrayList<MessageDTO> getAllMessages(String userID) {
        ArrayList<MessageDTO> userMessages = new ArrayList<>();
        for(MessageDTO message: messages){
            if (message.getReceiverID().equals(userID)){
                userMessages.add(message);
            }
        }
        return userMessages;
    }

    //public save(MessageDTO newMessage) {

    //}
    public void generateID(MessageDTO newMessage) {
        newMessage.setId(lastID++);

    }


    public static MessageDAO getInstance() {
        if (instance == null) {
            synchronized (MessageDAO.class) {
                if (instance == null) {
                    instance = new MessageDAO();
                }
            }
        }
        return instance;
    }

}
