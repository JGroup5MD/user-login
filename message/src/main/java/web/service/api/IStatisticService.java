package web.service.api;




import web.dto.*;

import java.util.List;

public interface IStatisticService {

    StatisticsDto getStatistics();

    public List<UserDto> getAllUsers();
    public UserDto deleteUser(String login, UserDto user);
    public void getActiveUsers();
    public UserDto deliteActiveUsers(UserDto user, String login,List<LoginDto> userLogin);
    public long countMassage(List<MessageDTO> list);



}
