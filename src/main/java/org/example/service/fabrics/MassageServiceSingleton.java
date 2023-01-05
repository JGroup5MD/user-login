package org.example.service.fabrics;

import org.example.service.API.IMessageService;
import org.example.service.MessageService;

public class MassageServiceSingleton {
    private volatile static IMessageService instance = null;

    public MassageServiceSingleton() {
    }

    public static IMessageService getInstance() {
        if (instance == null) {
            synchronized (MassageServiceSingleton.class) {
                if (instance == null) {
                    instance = new MessageService() {
                    };
                }
            }
        }
        return instance;
    }
}

