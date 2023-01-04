package org.example.service;

import java.util.Map;

public interface IMessageService {
    void save(Map<String, String[]> map,String userID);
    String getMessages(String userID);
}
