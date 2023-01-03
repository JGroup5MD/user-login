package web.service.fabrics;

import web.dao.fabrics.UserDaoSingleton;
import web.service.LoginService;
import web.service.api.ILoginService;


public class LoginServiceSingleton {
    private volatile static LoginService instance;

    private LoginServiceSingleton(){
    }

    public static ILoginService getInstance(){
        if(instance == null){
            synchronized (LoginServiceSingleton.class){
                if(instance == null){
                    instance = new LoginService(UserDaoSingleton.getInstance());
                }
            }

        }
        return instance;
    }
}
