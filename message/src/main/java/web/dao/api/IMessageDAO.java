package web.dao.api;

import web.dto.MessageDTO;

import java.util.ArrayList;
import java.util.List;

public interface IMessageDAO {
    void registerNewMessage(MessageDTO newMessage);
    List<MessageDTO> getAllMessages(String userID);
    void generateID(MessageDTO newMessage);

    int getTotalCount();
    // long countMassage(List<MessageDTO> message);
}
