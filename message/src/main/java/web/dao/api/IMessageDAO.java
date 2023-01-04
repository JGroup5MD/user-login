package web.dao.api;

import web.dto.MessageDTO;

import java.util.ArrayList;

public interface IMessageDAO {
    void registerNewMessage(MessageDTO newMessage);
    ArrayList<MessageDTO> getAllMessages(String userID);
    void generateID(MessageDTO newMessage);
}
