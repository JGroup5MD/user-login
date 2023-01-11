package web.service.api;

import web.dto.MessageDTO;

public interface IMessageService {

    String getMessages(String receiver);

    //long countMassage(List<MessageDTO> list);

    void save(MessageDTO message);
}
