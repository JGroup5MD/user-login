package dao.api;

import dto.UserDto;

import java.util.List;

public interface IUserDao {

    void save(UserDto user);

    List<UserDto> get();
}
