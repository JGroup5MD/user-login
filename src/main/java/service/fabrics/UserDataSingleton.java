package service.fabrics;

import dao.fabrics.UserDataDaoSingleton;
import service.UserDataService;
import service.api.IUserDataDto;

public class UserDataSingleton {
    private volatile static UserDataService instance;

    public UserDataSingleton() {
    }
    public static IUserDataDto getInstance () {
        if (instance == null){
            synchronized (UserDataSingleton.class) {
                if(instance==null) {
                    instance = new UserDataService(UserDataDaoSingleton.getInstance());
                }
            }
        }
        return instance;
    }
}
