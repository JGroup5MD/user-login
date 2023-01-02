package org.example.DAO.fabrics;

import org.example.DAO.API.IUserDAO;
import org.example.DAO.UserDAO;
import org.example.DTO.UserAndRoleRegistration;

public class UserDaoSingleton {
    private volatile static UserDAO instance;
      private UserDaoSingleton() {
    }
    public static IUserDAO getInstance(){
        if(instance == null){
            synchronized (UserDaoSingleton.class){
                if(instance == null){
                    instance = new UserAndRoleRegistration();
                }
            }
        }
        return instance;
    }
}
