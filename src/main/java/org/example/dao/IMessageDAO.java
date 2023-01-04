package org.example.dao;

import java.util.ArrayList;

public interface IMessageDAO {
    void registerNewMessage(MessageDTO newMessage);
    ArrayList<MessageDTO> getAllMessages(String userID);
    void generateID(MessageDTO newMessage);
}
