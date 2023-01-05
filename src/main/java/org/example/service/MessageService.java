package org.example.service;

import org.example.DAO.API.IMessageDAO;
import org.example.DAO.MessageDAO;
import org.example.DTO.MessageDTO;
import org.example.service.API.IMessageService;

import java.util.List;


public class MessageService implements IMessageService {

    private final IMessageDAO imdao;

    public MessageService() {
        this.imdao = new MessageDAO();
    }

    public List <MessageDTO> addMessage(MessageDTO message, List<MessageDTO> list){
        imdao.addMessage(message,list);
        return list;
    }

    public  List<MessageDTO> getAllmassege(List<MessageDTO> list){
        imdao.getAllmassege(list);
        return list;
    }
    public  List<MessageDTO> getMessageForUser(MessageDTO message,String sender,List <MessageDTO> list){
        imdao.getMessageForUser(message,sender,list);
        return list;
    }
    public  List<MessageDTO>  deliteMesage(MessageDTO message, String sender, String recipient, List<MessageDTO> list) {
        imdao.deliteMesage(message,sender,recipient,list);
        return list;
    }
    public long countMassage(List<MessageDTO> list, long count) {
        imdao.countMassage(list,count);
    return count;
    }
}
//
//    @Override
//    public List<MessageDTO>  addMessage(List<MessageDTO> list, long countMessage, Integer key) {
//        Map<Integer, List<MessageDTO>> map=new ConcurrentHashMap<>();
//        return map.put(key,list);
//    }
//    @Override
//    public  List<MessageDTO> getAtRecipient(String recipient) {
//        List<MessageDTO> list=new ArrayList<>();
//        for(MessageDTO item:list){
//            if(item.getRecipient().equals(recipient)){
//                return list;
//            }
//        }
//        throw new IllegalArgumentException("адрес данного получателя нет ни одного сообщения");
//    }
//    @Override
//    public List<MessageDTO> getAtSender(String sender){
//        List<MessageDTO> list=new ArrayList<>();
//        for(MessageDTO item:list){
//            if(item.getSender().equals(sender)){
//                return list;
//            }
//        }
//        throw new IllegalArgumentException("от данного отправителя  нет ни одного сообщения");
//    }
//    @Override
//    public Map<Integer, List<MessageDTO>> getAllMessage(Map<Integer, List<MessageDTO>> mapMessage){
//        mapMessage.size();
//        return mapMessage;
//    }
//
//    @Override
//    public List<MessageDTO> deliteMessage(MessageDTO message, Integer key, String sender, String recipient){
//        Map<Integer, List<MessageDTO>> map=new ConcurrentHashMap<>();
//        map.remove(key);
//       for( Map.Entry<Integer, List<MessageDTO>> item: map.entrySet()){
//           if(Objects.equals(sender!=null, message.getSender()!=null)){
//               return map.remove(item.getKey());
//           }
//        }
//        for( Map.Entry<Integer, List<MessageDTO>> item: map.entrySet()){
//            if(Objects.equals(recipient!=null, message.getRecipient()!=null)){
//                return map.remove(item.getKey());
//            }
//    }
//        throw new IllegalArgumentException("такого отправителя или получателя среди зарегистрированных пользователей не найдено");
//    }
//}





