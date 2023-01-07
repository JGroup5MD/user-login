package web.service.api;




import web.dto.LoginDto;
import web.dto.MessageDTO;
import web.dto.Role;
import web.dto.UserDto;

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

    public void getAllUsers(Map<Integer, UserDto> map);
    public UserDto deleteUser(String login, UserDto user);
    public void getActiveUsers(Role role, List<LoginDto> userLogin);
    public UserDto deliteActiveUsers(UserDto user, String login,List<LoginDto> userLogin);
    public long countMassage(List<MessageDTO> list);



}
