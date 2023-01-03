package dao.fabrics;

import dao.UserDataDao;
import dao.api.IUserDataDao;
import service.fabrics.UserDataSingleton;

public class UserDataDaoSingleton {

    private volatile static UserDataDao instance;

    public UserDataDaoSingleton() {
    }

    public static IUserDataDao getInstance() {
        if (instance == null) {
            synchronized (UserDataSingleton.class) {
                if (instance == null) {
                    instance = new UserDataDao();
                }
            }
        }
        return instance;
    }
}