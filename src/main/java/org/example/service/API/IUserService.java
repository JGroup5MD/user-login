package org.example.service.API;

import org.example.DTO.UserDTO;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface IUserService {
   List<UserDTO>get();
   Map<Integer, UserDTO> getMapUser();
}
