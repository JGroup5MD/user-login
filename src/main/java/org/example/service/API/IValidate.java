package org.example.service.API;

import org.example.DTO.CredentialsDTO;
import org.example.DTO.DatesDTO;
import org.example.DTO.MessageDTO;
import org.example.DTO.UserDTO;

public interface IValidate {
    public void validateUSER(UserDTO user);
    public void validateMessage(MessageDTO message);
    public CredentialsDTO validateCREDENTIALS(CredentialsDTO credentials);
    public void validateDates(DatesDTO datesDTO);

}
