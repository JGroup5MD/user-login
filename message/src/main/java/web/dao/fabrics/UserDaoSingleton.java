package web.dao.fabrics;

import web.dao.UserDao;
import web.dao.api.IUserDao;
import web.service.fabrics.RegistrationServiceSingleton;

public class UserDaoSingleton {
    private volatile static UserDao instance;

    private UserDaoSingleton(){
    }

    public static IUserDao getInstance() {
        if(instance == null){
            synchronized (RegistrationServiceSingleton.class){
                if(instance == null){
                    instance = new UserDao();
                }
            }
        }
        return instance;
    }
}
