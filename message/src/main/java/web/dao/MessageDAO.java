package web.dao;

import web.dao.api.IMessageDAO;
import web.dto.MessageDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MessageDAO implements IMessageDAO {
    private volatile static MessageDAO instance;

    private final ArrayList<MessageDTO> messages = new ArrayList<>();

    private int lastID;
    public void registerNewMessage(MessageDTO newMessage) {
        generateID(newMessage);
        newMessage.setDate(new Date());
        messages.add(newMessage);
    }


    //public get(int messageID, int userID) {

    //}

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

    @Override
    public long countMassage(List<MessageDTO> list) {
        long count = 0;
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
