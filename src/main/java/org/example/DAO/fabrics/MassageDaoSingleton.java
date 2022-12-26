package org.example.DAO.fabrics;

import org.example.DAO.API.IMessageDAO;
import org.example.DAO.MessageDAO;

public class MassageDaoSingleton {

        private volatile static IMessageDAO instance = null;

    public MassageDaoSingleton() {
    }

    public static IMessageDAO getInstance() {
            if (instance == null) {
                synchronized (MassageDaoSingleton.class) {
                    if (instance == null) {
                        instance = new MessageDAO() {
                        };
                    }
                }
            }
            return instance;
        }
    }

