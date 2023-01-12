package web.service;
import web.dao.api.IUserDao;
import web.dto.LoginDto;
import web.dto.Role;
import web.dto.UserDto;
import web.model.PassEncBase;
import web.service.api.ILoginService;
import web.service.api.IRegistrationService;

import java.util.List;

public class LoginService implements ILoginService {

    private int position;
    private final IUserDao dao;
    private boolean authorized;

    private IRegistrationService regService;

    public LoginService(IUserDao dao) {
        this.dao = dao;
    }

    @Override
    public List<UserDto> get() {
        return this.regService.get();
    }


    @Override
    public boolean exist(String login) {
        boolean resultExist = false;
        for (int i=0; i < dao.get().size(); i++) {
            if(login.equals(dao.get().get(i).getNewUserDto().getLogin())){
                resultExist = true;
                position = i;
            }
        }
        return resultExist;
    }

    @Override
    public boolean authenticate(String password) {
        boolean resultAuth = false;
        String encPassword = dao.get().get(position).getNewUserDto().getPassword();
        String salt = dao.get().get(position).getNewUserDto().getSalt();
        if(PassEncBase.verifyUserPassword(password, encPassword, salt)){
            resultAuth = true;
        };
        return resultAuth;
    }

    @Override
    public boolean getAuthorized(LoginDto creds){
        authorized = false;
        if (this.exist(creds.getLogin())) {
           if(this.authenticate(creds.getPassword())){
               authorized = true;
           }
        }
        return authorized;
    }
    @Override
    public boolean isAuthorized() {
        return authorized;
    }

    public boolean isAdmin() {
        boolean admin = false;
        if(authorized){
            if(dao.get().get(position).getRole() == Role.ADMIN){
                admin = true;
            }
        }
        return admin;
    }

    public boolean isAdmin(String login) {
        UserDto user = dao.findUserByLogin(login);
        if(user == null){
            return false;
        }
        return user.getRole().equals(Role.ADMIN);
    }

    @Override
    public UserDto deliteActiveUsers(UserDto user, String login, List<LoginDto> userLogin) {
        return null;
    }

    public void addActiveUser(LoginDto activeUser, String login, String password, List<LoginDto> userLogin,long activeUsers) {
        activeUsers = 0;
        if (isAuthorized()) {
                userLogin.add(activeUser);
                activeUsers++;
        } throw new IllegalArgumentException("404, incorrect parametrs");
    }


    }


