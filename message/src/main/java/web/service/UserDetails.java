package web.service;

import web.appuser.GrantedAuthority;
import web.dao.UserDao;
import web.model.Role;
import web.model.User;
import web.service.api.IUserDetails;

import java.util.HashSet;
import java.util.Set;

public class UserDetails implements IUserDetails {

    private UserDao userDao;

    @Override
    public UserDetails loadUserByLogin(String login) {
        User user = userDao.findByUsername(login);
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();


        return null;
    }
}
