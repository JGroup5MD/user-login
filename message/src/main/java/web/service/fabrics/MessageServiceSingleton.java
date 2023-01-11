package web.service.fabrics;

import web.dao.fabrics.MessageDAOSingleton;
import web.service.MessageService;
import web.service.api.IMessageService;

public class MessageServiceSingleton {
    private volatile static MessageService instance;

    public MessageServiceSingleton() {
    }
    public static IMessageService getInstance(){
        if(instance==null){
            synchronized (MessageServiceSingleton.class){
                if(instance==null){
                    instance=new MessageService(MessageDAOSingleton.getInstance());
                }
            }
        }return instance;
    }
}
