package service.api;

import dto.SaveUserDataDto;
import dto.UserDataDto;

import java.util.List;

public interface IUserDataDto {
    void save(UserDataDto userDataDto);

    List <UserDataDto> get();

}
