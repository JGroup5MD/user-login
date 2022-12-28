package org.example.service.fabrics;

import org.example.DAO.API.IMessageDAO;
import org.example.DAO.fabrics.MassageDaoSingleton;
import org.example.service.API.IMessageService;
import org.example.service.MessageService;

public class MassageServiceSingleton {
    private volatile static MessageService instance = null;

    public MassageServiceSingleton() {
    }

    public static IMessageService getInstance() {
        if (instance == null) {
            synchronized (MassageServiceSingleton.class) {
                if (instance == null) {
                    instance = new MessageService(getInstance()) {
                    };
                }
            }
        }
        return instance;
    }
}

