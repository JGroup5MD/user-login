package web.service.fabrics;

import web.dao.fabrics.UserDaoSingleton;

import web.service.RegistrationService;
import web.service.api.IRegistrationService;

public class RegistrationServiceSingleton {

    private volatile static RegistrationService instance;

    private RegistrationServiceSingleton(){
    }

    public static IRegistrationService getInstance(){
        if(instance == null){
            synchronized (RegistrationServiceSingleton.class){
                if(instance == null){
                    instance = new RegistrationService(UserDaoSingleton.getInstance());
                }
            }

        }
        return instance;
    }

}
