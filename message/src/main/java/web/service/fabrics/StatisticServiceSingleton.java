package web.service.fabrics;

public class StatisticServiceSingleton {

    private volatile static StatisticServiceSingleton instance;



    public static StatisticServiceSingleton getInstance(){
        if(instance==null){
            synchronized (StatisticServiceSingleton.class){
                if (instance==null){
                    instance=new StatisticServiceSingleton();

            }
        }
        return instance;
    }
        return null;
    }
}

