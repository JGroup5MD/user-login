package org.example.DAO;

import org.example.DTO.CredentialsDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CredentialsDAO {

    Map<Integer, CredentialsDTO> userCrede=new HashMap<>();
    List<CredentialsDTO> listCrede=new ArrayList<>();
    public  List<CredentialsDTO> exist(String login, String password) {
        for(CredentialsDTO item:listCrede)
            if(listCrede.contains(login)&&listCrede.contains(password)){
        return listCrede;
            }
        return null;
    }

    private CredentialsDTO createUserLogin(CredentialsDTO credentialsDTO) {
        return new CredentialsDTO(credentialsDTO.getLogin(), credentialsDTO.getPassword());
    }
}
