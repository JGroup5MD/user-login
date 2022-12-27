package web.service.api;

import web.dto.NewUserDto;
import web.dto.UserDto;
import web.model.User;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

public interface IUserService {

    void save(User user) throws NoSuchAlgorithmException, InvalidKeySpecException;

    User findByUsername(String login);
    List<UserDto> get();

    boolean exists(String name);
}
