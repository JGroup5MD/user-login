package web.dao.fabrics;

import web.dao.MessageDAO;
import web.dao.api.IMessageDAO;

public class MessageDAOSingleton {
    private  volatile  static MessageDAO instance;
    public MessageDAOSingleton() {
    }
    public static IMessageDAO getInstance(){
        if (instance==null){
            synchronized (MessageDAOSingleton.class){
                if(instance==null){
                    instance=new MessageDAO();
                }
            }
        }
        return instance;
    }
}
