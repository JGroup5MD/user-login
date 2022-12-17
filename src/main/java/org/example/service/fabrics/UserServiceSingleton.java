package org.example.service.fabrics;

import org.example.dao.fabrics.UserDaoSingleton;
import org.example.service.UserService;

public class UserServiceSingleton {
    private volatile static UserService instance;

    private UserServiceSingleton() {
    }
    public  static UserService getInstance(){
        if(instance==null){
            synchronized (UserService.class){
                if(instance==null){
                    instance=new UserService(UserDaoSingleton.getInstance());
                }
            }
        }
        return instance;
    }
}
