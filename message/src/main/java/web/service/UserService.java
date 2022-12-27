package web.service;

import web.dao.api.IRoleDao;
import web.dao.api.IUserDao;
import web.dto.UserDto;
import web.model.Role;
import web.model.User;
import web.service.api.IUserService;

import java.util.List;

public class UserService implements IUserService {

    private IUserDao userDao;
    private IRoleDao roleDao;


    @Override
    public void save(User user) {
        user.setPassword(PassEncBase.generateSecurePassword(user.getPassword(), PassEncBase.getSaltvalue(30)));
        user.setRole(Role.USER);
        userDao.save(user);
    }



    @Override
    public User findByUsername(String login) {
        return userDao.findByUsername(login);
    }

    @Override
    public List<UserDto> get() {
        return null;
    }

    @Override
    public boolean exists(String login) {
        return false;
    }

    public static void main(String[] args) {
        User me = new User();
        me.setId(10L);
        me.setUsername("Noah");
        me.setPassword("123qwe");
        me.setConfirmPass("123qwe");
        System.out.println(me.getUsername());

        UserService serv = new UserService();
        serv.save(me);
    }


}
