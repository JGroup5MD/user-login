package org.example.service.fabrics;

import org.example.DAO.UserAndRoleRegistrationDAO;
import org.example.DAO.fabrics.UserAndRoleRegistrationSingletonDAO;
import org.example.DTO.UserAndRoleRegistration;
import org.example.service.API.IUserAndRoleRegistrationService;
import org.example.service.UserAndRoleRegistrationService;

public class UserAndRoleRegistrationServiceSingleton {
    private volatile static IUserAndRoleRegistrationService instance;

    private UserAndRoleRegistrationServiceSingleton() {
    }
    public  static IUserAndRoleRegistrationService getInstance(){
        if(instance==null){
            synchronized (UserAndRoleRegistrationServiceSingleton.class){
                if(instance==null){
                    instance=new UserAndRoleRegistrationService(UserAndRoleRegistrationSingletonDAO.getInstance());
                }
            }
        }
        return instance;
    }
}
