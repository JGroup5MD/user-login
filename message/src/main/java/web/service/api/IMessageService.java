package web.service.api;

import web.dto.MessageDTO;

import java.util.List;
import java.util.Map;

public interface IMessageService {

    String getMessages(String receiver);

    long countMassage(List<MessageDTO> list);

    void save(MessageDTO message);
}
