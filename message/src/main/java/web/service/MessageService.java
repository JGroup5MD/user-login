package web.service;

import web.dao.api.IMessageDAO;
import web.dao.fabrics.MessageDAOSingleton;
import web.dto.MessageDTO;
import web.service.api.IMessageService;

import java.time.LocalDateTime;
import java.util.List;


public class MessageService implements IMessageService {

    private  final IMessageDAO dao;

    public MessageService(IMessageDAO dao) {
        this.dao = dao;
    }

    public void save(MessageDTO message){
        this.validateMessage(message);
        message.setDate(LocalDateTime.now());
        this.dao.registerNewMessage(message);

    }

    public void validateMessage(MessageDTO message) {
        if(message.getText()==null){
            throw new IllegalArgumentException("Вы пытаетесь отправить пустое сообщение, сообщение не может быть короче 15 символов");
        }
        if(message.getReceiver()==null){
            throw  new IllegalArgumentException("вы не указали кто будет получателем сообщения");
        }
    }

    public String getMessages(String userID){
        String s = "<p>Сообщения:</b>" +
                "</p><table><tbody><tr><th>Дата</th>" +
                "<th>От кого</th>" +
                "<th>Кому</th>" +
                "<th>Текст</th></tr>";
        for(MessageDTO message: MessageDAOSingleton.getInstance().getAllMessages(userID)){
            s = s + "<tr><td>" + message.getDate() +
                    "</td><td>" + message.getSender() +
                    "</td><td>" + message.getReceiver() +
                    "</td><td>" + message.getText() + "</td></tr>";
        }
        s = s + "</tbody></table>";
        return s;
    }

//    @Override
//    public long countMassage(List<MessageDTO> list) {
//            return dao.countMassage(list);
//    }


}
