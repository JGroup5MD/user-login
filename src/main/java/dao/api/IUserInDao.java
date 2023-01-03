package dao.api;

import dto.UserInDto;

import java.util.List;

public interface IUserInDao {
    void save (UserInDto userIn);

    List<UserInDto> get();
}
