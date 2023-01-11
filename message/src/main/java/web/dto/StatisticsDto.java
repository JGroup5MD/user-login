package web.dto;

import web.dao.MessageDAO;
import web.dao.api.IMessageDAO;

import java.util.List;

public class StatisticsDto {
    private List<UserDto> registeredUsers;
    private long messages;
    private List<LoginDto> loginedUsers;

    private List<MessageDTO> messageDTO;

    private MessageDAO messageDAO;


    public StatisticsDto(List<UserDto> registeredUsers,  List<LoginDto> loginedUsers) {
        this.registeredUsers = registeredUsers;
        this.messages = messageDAO.countMassage(messageDTO);
        this.loginedUsers = loginedUsers;
    }

    public List<UserDto> getRegisteredUsers() {
        return registeredUsers;
    }

    public long getMessages() {
        return messages;
    }

    public List<LoginDto> getLoginedUsers() {
        return loginedUsers;
    }
}
