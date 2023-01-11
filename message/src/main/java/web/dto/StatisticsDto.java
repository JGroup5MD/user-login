package web.dto;

public class StatisticsDto {
    private int registeredUsers;
    private int messages;
    private int loginedUsers;

    public StatisticsDto(int registeredUsers, int loginedUsers, int messageCount) {
        this.registeredUsers = registeredUsers;
        this.messages = messageCount;
        this.loginedUsers = loginedUsers;
    }

    public int getRegisteredUsers() {
        return registeredUsers;
    }

    public int getMessages() {
        return messages;
    }

    public int getLoginedUsers() {
        return loginedUsers;
    }
}
