package dao.api;

import dto.SaveUserDataDto;
import dto.UserDataDto;
import dto.UserInDto;

import java.util.List;

public interface IUserDataDao {
    void save(SaveUserDataDto userData);

    List<UserDataDto> get();
}
