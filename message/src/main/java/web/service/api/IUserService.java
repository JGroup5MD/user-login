package web.service.api;

import web.dto.NewUserDto;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

public interface IUserService {

    void save(NewUserDto user) throws NoSuchAlgorithmException, InvalidKeySpecException;

  /*  NewUserDto findByUsername(String login);*/
    List<NewUserDto> get();

    boolean exists(String name);
}
