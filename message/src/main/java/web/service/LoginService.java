package web.service;
import web.dao.api.IUserDao;
import web.dto.LoginDto;
import web.dto.UserDto;
import web.service.api.ILoginService;
import web.service.api.IRegistrationService;

import java.util.List;

public class LoginService implements ILoginService {

    private int position;
    private IUserDao dao;
    private boolean authorized;

    IRegistrationService regService;

    public LoginService(IUserDao dao) {
        this.dao = dao;
    }

    @Override
    public List<UserDto> get() {
        return this.dao.get();
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


    }


