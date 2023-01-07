package web.service;


import web.dao.MessageDAO;
import web.dao.api.IMessageDAO;
import web.dto.MessageDTO;
import web.service.api.IMessageService;

import java.util.List;
import java.util.Map;

public class MessageService implements IMessageService {
    private volatile static MessageService instance;
    private IMessageDAO dao;

    public void save(Map<String, String[]> map, String userID){
        MessageDTO newMessage = new MessageDTO();

        String[] receiverID = map.get("receiverID");
        String[] text = map.get("text");

        newMessage.setSenderID(userID);
        newMessage.setReceiverID(receiverID[0]);
        newMessage.setText(text[0]);
        validateMessage(newMessage);
        MessageDAO.getInstance().registerNewMessage(newMessage);

    }

    public void validateMessage(MessageDTO message) {
        if(message.getText()==null ||message.getText().length()<15){
            throw new IllegalArgumentException("Вы пытаетесь отправить пустое сообщение, сообщение не может быть короче 15 символов");
        }
        if(message.getReceiverID()==null){
            throw  new IllegalArgumentException("вы не указали кто будет получателем сообщения");
        }
    }

    public String getMessages(String userID){
        String s = "<p>Сообщения:</b>" +
                "</p><table><tbody><tr><th>Дата</th>" +
                "<th>От кого</th>" +
                "<th>Кому</th>" +
                "<th>Текст</th></tr>";
        for(MessageDTO message: MessageDAO.getInstance().getAllMessages(userID)){
            s = s + "<tr><td>" + message.getDate() +
                    "</td><td>" + message.getSenderID() +
                    "</td><td>" + message.getReceiverID() +
                    "</td><td>" + message.getText() + "</td></tr>";
        }
        s = s + "</tbody></table>";
        return s;
    }

    @Override
    public long countMassage(List<MessageDTO> list) {
            return dao.countMassage(list);
    }


    public static MessageService getInstance() {
        if (instance == null) {
            synchronized (MessageService.class) {
                if (instance == null) {
                    instance = new MessageService();
                }
            }
        }
        return instance;
    }
}
