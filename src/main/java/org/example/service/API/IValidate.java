package org.example.service.API;


import org.example.DTO.LoginDTO;
import org.example.DTO.MessageDTO;
import org.example.DTO.UserAndRoleRegistration;
import org.example.DTO.UserDTO;

import java.util.List;

public interface IValidate {
    public void validateUSER(UserDTO user);
    public void validateMessage(MessageDTO message);
    public String informValidLogin(String login, List<LoginDTO> userLogin);

    public String informValidPassword(String password,List<LoginDTO> userLogin);

    public void validateUserAndRole(UserAndRoleRegistration userRegistration);
}
