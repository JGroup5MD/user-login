package org.example.service.fabrics;

import org.example.service.API.ILoginService;
import org.example.service.LoginService;

public class LoginServiceSingleton {
    private volatile  static LoginServiceSingleton instance;

    private LoginServiceSingleton() {
    }

    public static ILoginService getInstance() {
        if (instance == null) {
            synchronized (LoginService.class) {
                if (instance == null) {
                    instance = new LoginService(UserAndRoleAndDateRegistrationSingleton.getInstance);
                }
            }
        }
        return instance;
    }
}

