package web.service;

import web.appuser.GrantedAuthority;
import web.dao.UserDao;
import web.dto.NewUserDto;
import web.service.api.IUserDetails;

import java.util.HashSet;
import java.util.Set;

public class UserDetails implements IUserDetails {

    private UserDao userDao;

    public UserDetails(NewUserDto newUserDto) {
    }

/*    @Override
    public UserDetails loadUserByLogin(String login) {
        NewUserDto user = userDao.findByUsername(login);
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();


        return null;
    }*/
}
