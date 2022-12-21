package service.fabrics;

import service.UsersService;
import service.api.IUserService;

public class UsersServiceSingleton {
    private volatile static UsersService instance;

    private UsersServiceSingleton(){
    }

    public static IUserService getInstance() {
        if(instance == null){
            synchronized (CredsServiceSingleton.class){
                if(instance == null){
                    instance = new UsersService(UsersDaoSingleton.class);
                }
            }
        }
        return instance;
    }

}
