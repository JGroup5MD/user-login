package web.dao.api;
import web.dto.UserDto;


import java.util.List;

public interface IUserDao {

    void save(UserDto user);

    List<UserDto> get();
    public int getTotalCount();

}