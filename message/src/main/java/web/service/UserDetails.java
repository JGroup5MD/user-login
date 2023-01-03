package web.service;


import web.dao.UserDao;
import web.dto.NewUserDto;
import web.service.api.IUserDetails;



public class UserDetails implements IUserDetails {

    private UserDao userDao;

    public UserDetails(NewUserDto newUserDto) {
    }

}
