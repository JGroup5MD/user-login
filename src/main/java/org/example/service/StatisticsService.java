package org.example.service;

import org.example.dao.ActiveSessionDAO;
import org.example.dao.MessageDAO;

public class StatisticsService implements IStatisticsService {
    private volatile static StatisticsService instance;

    public String getStatistics() {
        int activeUsers = ActiveSessionDAO.getInstance().getTotalCount();
        int sendedMessages = MessageDAO.getInstance().getTotalCount();

        String s = "<p><b>Количество пользователей в приложении: </b></p>" + activeUsers + "<p><b>Количество сообщений, отправленных в приложении: </b></p>" + sendedMessages;
        return s;
    }

    public static StatisticsService getInstance() {
        if (instance == null) {
            synchronized (StatisticsService.class) {
                if (instance == null) {
                    instance = new StatisticsService();
                }
            }
        }
        return instance;
    }
}
