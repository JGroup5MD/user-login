package web.service.api;

import web.dto.MessageDTO;

import java.util.List;
import java.util.Map;

public interface IMessageService {
    void save(Map<String, String[]> map,String userID);
    String getMessages(String userID);

    long countMassage(List<MessageDTO> list);
}
