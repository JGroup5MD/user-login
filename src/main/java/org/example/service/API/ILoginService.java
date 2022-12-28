package org.example.service.API;

import org.example.DTO.UserDTO;

import java.util.List;

public interface ILoginService {
    public void NotLogin(String login);
    public void NotPassword(String password);
    public List<UserDTO> NotUserToRegistration(String loginUser, String passwordUser);
}
