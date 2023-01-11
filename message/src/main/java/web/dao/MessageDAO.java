package web.dao;

import web.dao.api.IMessageDAO;
import web.dto.MessageDTO;

import java.util.ArrayList;
import java.util.List;


public class MessageDAO implements IMessageDAO {
    private volatile static MessageDAO instance;

    private final List<MessageDTO> messages = new ArrayList<>();

    private int lastID;
    public void registerNewMessage(MessageDTO newMessage) {
        generateID(newMessage);
        messages.add(newMessage);
    }


    public List<MessageDTO> getAllMessages(String userID) {
        List<MessageDTO> userMessages = new ArrayList<>();
        for(MessageDTO message: messages){
            if (message.getReceiver().equals(userID)){
                userMessages.add(message);
            }
        }
        return userMessages;
    }

    public void generateID(MessageDTO newMessage) {
        newMessage.setId(lastID++);
    }

    @Override
    public int getTotalCount() {
        return messages.size();
    }

//    @Override
//    public long countMassage(List<MessageDTO> message) {
//        long count = 0;
//        if (message.isEmpty()){
//            count=0;
//        }
//        for(MessageDTO item : message){
//            if (item!=null){
//                count++;
//            }
//        }
//        return count;
//    }


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
