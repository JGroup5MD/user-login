package web.service.api;




import web.dto.*;

import java.util.List;

public interface IStatisticService {

    //List<UserDto> getAllUsers();
    //UserDto deleteUser(String login, UserDto user);
    //UserDto deliteActiveUsers(UserDto user, String login,List<LoginDto> userLogin);
    //long countMassage(List<MessageDTO> list);

    StatisticsDto getStatistics();
}
