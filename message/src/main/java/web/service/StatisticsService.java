package web.service;



import web.dao.api.IMessageDAO;
import web.dao.api.IUserDao;
import web.dto.*;
import web.service.api.ILoginService;
import web.service.api.IStatisticService;


public class StatisticsService implements IStatisticService {

    private IMessageDAO messageInfo;
    private ILoginService loginService;
    private IUserDao registrationInfo;

    private Role role;

    public StatisticsService(ILoginService loginService, IUserDao registrationInfo, IMessageDAO messageInfo) {
        this.loginService = loginService;
        this.messageInfo = messageInfo;
        this.registrationInfo = registrationInfo;
    }

    public StatisticsDto getStatistics() {
        return new StatisticsDto(
                registrationInfo.getTotalCount(),
                loginService.getActiveUsers(),
                messageInfo.getTotalCount()
        );
    }




//    @Override
//    public StatisticsDto getStatistics() {
//        return null;
//    }
//
//    @Override
//    public List<UserDto> getAllUsers() {
//        return null;
//    }
//
//    public UserDto deleteUser(String login, UserDto user) {
//        return this.iurs.deleteUser(login, user);
//    }




//    @Override
//    public UserDto deliteActiveUsers(UserDto user, String login, List<LoginDto> userLogin) {
//        if (ls.isAdmin()) {
//            return this.ls.deliteActiveUsers(user, login, userLogin);
//        }
//        return null;
//    }
//
//    @Override
//    public long countMassage(List<MessageDTO> list) {
//        if (ls.isAdmin()) {
//            return this.ms.countMassage(list);
//        }
//        return 0;
//    }

}






