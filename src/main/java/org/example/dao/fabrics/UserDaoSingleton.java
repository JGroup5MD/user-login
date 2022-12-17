package org.example.dao.fabrics;

import org.example.dao.UserDAO;

public class UserDaoSingleton {
    private volatile static UserDAO instance;
      private UserDaoSingleton() {
    }
    public static UserDAO getInstance(){
        if(instance == null){
            synchronized (UserDaoSingleton.class){
                if(instance == null){
                    instance = new UserDAO();
                }
            }
        }
        return instance;
    }
}
