package service.api;

import dto.UsersDTO;

import java.util.List;

public interface IUserService {
    List<UsersDTO> get();

    boolean exists(String name);
}
