package org.example.service.API;

import java.io.IOException;
import java.util.Map;

public interface IUserService {
    public void save(Map<String, String[]> map) throws IOException, Exception;
}