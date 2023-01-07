package web.dao.api;

import web.dto.MessageDTO;

import java.util.ArrayList;
import java.util.List;

public interface IMessageDAO {
    void registerNewMessage(MessageDTO newMessage);
    ArrayList<MessageDTO> getAllMessages(String userID);
    void generateID(MessageDTO newMessage);

    public long countMassage(List<MessageDTO> list);
}
