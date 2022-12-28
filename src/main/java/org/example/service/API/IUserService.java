package org.example.service.API;

import org.example.DTO.UserDTO;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface IUserService {
   public List<UserDTO> get(List<UserDTO> list);
   public Map<Integer, UserDTO> getMapUser(Map<Integer, UserDTO> map);
}
