package web.service;

import web.dao.UserDao;
import web.dao.api.IRoleDao;
import web.dao.api.IUserDao;
import web.dto.NewUserDto;
import web.dto.Role;
import web.dto.UserDto;
import web.service.api.IUserService;

import java.time.Instant;
import java.util.Date;
import java.util.List;

public class UserService implements IUserService {

    private IUserDao userDao;
    private IRoleDao roleDao;

    public UserService(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(NewUserDto user) {
        user.setPassword(PassEncBase.generateSecurePassword(user.getPassword(), PassEncBase.getSaltvalue(30)));
        UserDto userDto = new UserDto(user);
        this.userDao.save(userDto);
    }



    @Override
    public List<NewUserDto> get() {
        return null;
    }

    @Override
    public boolean exists(String login) {
        return false;
    }




}
