package org.example.DAO.API;

import org.example.DTO.LoginDTO;

public interface ICredentialsDAO {
    public boolean exist(String login);
    public LoginDTO createUserLogin(LoginDTO credentialsDTO);
}
