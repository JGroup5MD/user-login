package web.service;



import web.dao.api.IMessageDAO;
import web.dao.api.IUserDao;
import web.dto.*;
import web.service.api.ILoginService;
import web.service.api.IMessageService;
import web.service.api.IRegistrationService;
import web.service.api.IStatisticService;

import java.util.List;


public class StatisticsService implements IStatisticService {

    private IMessageService ms;
    private ILoginService ls;
    private IRegistrationService iurs;

    private Role role;


    public StatisticsService() {

    }

    public StatisticsService(ILoginService instance, IUserDao instance1, IMessageDAO instance2) {
    }


    @Override
    public StatisticsDto getStatistics() {
        return null;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }

    public UserDto deleteUser(String login, UserDto user) {
        return this.iurs.deleteUser(login, user);
    }


    @Override
    public void getActiveUsers() {
        if (ls.isAdmin()) {
            this.ls.get();
        }
    }

    @Override
    public UserDto deliteActiveUsers(UserDto user, String login, List<LoginDto> userLogin) {
        if (ls.isAdmin()) {
            return this.ls.deliteActiveUsers(user, login, userLogin);
        }
        return null;
    }

    @Override
    public long countMassage(List<MessageDTO> list) {
        if (ls.isAdmin()) {
            return this.ms.countMassage(list);
        }
        return 0;
    }
}






