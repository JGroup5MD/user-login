package org.example.service.API;


import org.example.DTO.LoginDTO;
import org.example.DTO.MessageDTO;
import org.example.DTO.UserAndRoleRegistration;
import org.example.DTO.UserRole;

import java.util.List;
import java.util.Map;

public interface IStatisticService {
//    public LoginDTO getActiveUsers(UserRole role);
//    public Map<Integer, List<MessageDTO>> getAllMessage(List<String> message);
//    public void gettAllUsers(UserRole role);
//    public void addMessage(List<MessageDTO> message, long CountMessage, Integer key);
//    public void deliteMessage(MessageDTO message, Integer key, String sender, String recipient);
//    public void  getMessageAtSender(String sender);
//    public void  getMessageTaRecipient(String recipient);

    public void getAllUsers(Map<Integer, UserAndRoleRegistration> map);
    public UserAndRoleRegistration deleteUser(String login, UserAndRoleRegistration user);
    public void getActiveUsers(UserRole role, List<LoginDTO> userLogin);
    public UserAndRoleRegistration deliteActiveUsers(UserAndRoleRegistration user, String login,List<LoginDTO> userLogin);
    public List <MessageDTO> addMessage(MessageDTO message, List<MessageDTO> list);
    public  List <MessageDTO>   getAllmassege(List<MessageDTO> list);
    public  List<MessageDTO> getMessageForUser(MessageDTO message,String sender,List <MessageDTO> list);
    public long countMassage(List<MessageDTO> list, long count);
    public void gettAllUsers(UserRole role, Map<Integer, UserAndRoleRegistration> map);

}
