package web.service;


import web.dao.MessageDAO;
import web.dto.MessageDTO;
import web.service.api.IMessageService;

import java.util.Map;

public class MessageService implements IMessageService {
    private volatile static MessageService instance;

    public void save(Map<String, String[]> map, String userID){
        MessageDTO newMessage = new MessageDTO();

        String[] receiverID = map.get("receiverID");
        String[] text = map.get("text");

        newMessage.setSenderID(userID);
        newMessage.setReceiverID(receiverID[0]);
        newMessage.setText(text[0]);

        MessageDAO.getInstance().registerNewMessage(newMessage);

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
