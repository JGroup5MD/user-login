package web.service.fabrics;


import web.dao.ActiveSessionDAO;
import web.dao.fabrics.MessageDAOSingleton;
import web.dao.fabrics.UserDaoSingleton;
import web.service.StatisticsService;

import web.service.api.IStatisticService;

public class StatisticServiceSingleton {

    private volatile static StatisticsService instance;

    private StatisticServiceSingleton() {
    }

    public static IStatisticService getInstance(){
        if(instance==null){
            synchronized (StatisticServiceSingleton.class){
                if (instance==null){
                    instance= new StatisticsService(
                            ActiveSessionDAO.getInstance(),
                            UserDaoSingleton.getInstance(),
                            MessageDAOSingleton.getInstance());

            }
        }

    }
        return instance;
    }
}

