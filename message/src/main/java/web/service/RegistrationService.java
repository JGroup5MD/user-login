package web.service;

import web.dao.api.IUserDao;
import web.dto.NewUserDto;
import web.dto.UserDto;
import web.service.api.IRegistrationService;

import java.util.List;

public class RegistrationService implements IRegistrationService {

    private IUserDao dao;

    public RegistrationService(IUserDao dao) {
        this.dao = dao;
    }


    @Override
    public void save(NewUserDto user) {
        this.validate(user);
        UserDto userDto = new UserDto(user);
        this.dao.save(userDto);
    }

    @Override
    public List<UserDto> get() {
        return this.dao.get();
    }

    @Override
    public UserDto deleteUser(String login, UserDto user) {
        return null;
    }


    public void validate(NewUserDto user){
        String login = user.getLogin();

        for (int i=0; i < this.dao.get().size(); i++) {

            if (login.equals(this.dao.get().get(i).getNewUserDto().getLogin())) {
                throw new IllegalArgumentException("Пользователь " + login + " уже зарегистрирован");
            }
        }


    }


}
