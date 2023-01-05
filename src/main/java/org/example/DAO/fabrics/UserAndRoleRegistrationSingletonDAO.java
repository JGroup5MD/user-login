package org.example.DAO.fabrics;


import org.example.DAO.API.IUserAndRoleRegistrationDAO;
import org.example.DAO.UserAndRoleRegistrationDAO;


public class UserAndRoleRegistrationSingletonDAO {
    private volatile static IUserAndRoleRegistrationDAO  instance;
      private UserAndRoleRegistrationSingletonDAO() {
    }
    public static IUserAndRoleRegistrationDAO getInstance(){
        if(instance == null){
            synchronized (IUserAndRoleRegistrationDAO.class){
                if(instance == null){
                    instance = new UserAndRoleRegistrationDAO();
                }
            }
        }
        return instance;
    }
}
