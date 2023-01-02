package org.example.DAO.fabrics;


import org.example.DAO.UserAndRoleRegistrationDAO;


public class UserAndRoleRegistrationSingleton {
    private volatile static UserAndRoleRegistrationSingleton  instance;
      private UserAndRoleRegistrationSingleton() {
    }
    public static UserAndRoleRegistrationSingleton getInstance(){
        if(instance == null){
            synchronized (UserAndRoleRegistrationSingleton.class){
                if(instance == null){
                    instance = new UserAndRoleRegistrationSingleton();
                }
            }
        }
        return instance;
    }
}
