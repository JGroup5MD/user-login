package web.service.fabrics;

import web.service.UserService;

public class UsersServiceSingleton {
    private volatile static UserService instance;

   /* private UsersServiceSingleton(){
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
    }*/

}
