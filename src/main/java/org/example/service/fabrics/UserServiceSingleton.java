package org.example.service.fabrics;

import org.example.service.API.IUserService;
import org.example.service.UserService;

public class UserServiceSingleton {
    private volatile static UserService instance;

    private UserServiceSingleton() {
    }
    public  static IUserService getInstance(){
        if(instance==null){
            synchronized (UserService.class){
                if(instance==null){
                    instance=new UserService();
                }
            }
        }
        return instance;
    }
}
