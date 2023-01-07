package web.service;



import web.dto.LoginDto;
import web.dto.MessageDTO;
import web.dto.Role;
import web.dto.UserDto;
import web.service.api.ILoginService;
import web.service.api.IMessageService;
import web.service.api.IRegistrationService;
import web.service.api.IStatisticService;

import java.util.List;
import java.util.Map;
import java.util.Objects;


public class StatisticsService implements IStatisticService {

    private final IMessageService ms;
    private final ILoginService ls;
    private final IRegistrationService iurs;
    private final Role role;

    public StatisticsService(IMessageService ms, ILoginService ls, IRegistrationService iurs, Role role) {
        this.ms = ms;
        this.ls = ls;
        this.iurs = iurs;
        this.role = role;
    }

    // UserAndRoleRegistration = UserDto
    public void getAllUsers() {
        this.iurs.get();
    }

    @Override
    public void getAllUsers(Map<Integer, UserDto> map) {

    }

    public UserDto deleteUser(String login, UserDto user) {
        return this.iurs.deleteUser(login, user);
    }

    @Override
    public void getActiveUsers(Role role, List<LoginDto> userLogin) {
        if (Objects.equals(role, Role.ADMIN)) {
            this.ls.getActiveUsers(userLogin);
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






