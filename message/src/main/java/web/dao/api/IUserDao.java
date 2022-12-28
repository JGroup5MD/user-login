package web.dao.api;

import web.dto.NewUserDto;
import web.dto.UserDto;
import web.service.UserDetails;

import java.util.List;

public interface IUserDao {

    void save(UserDto user);

    List<UserDto> get();
}
