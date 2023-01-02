package web.dao.fabrics;

import web.dao.UserDao;
import web.dao.api.IUserDao;
import web.service.fabrics.LoginServiceSingleton;


public class UserDaoLoginSingleton {
    private volatile static UserDao instance;

    private UserDaoLoginSingleton(){
    }

    public static IUserDao getInstance() {
        if(instance == null){
            synchronized (LoginServiceSingleton.class){
                if(instance == null){
                    instance = new UserDao();
                }
            }
        }
        return instance;
    }
}
