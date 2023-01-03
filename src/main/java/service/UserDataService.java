package service;

import dao.api.IUserDataDao;
import dto.SaveUserDataDto;
import dto.UserDataDto;
import service.api.IUserDataDto;

import java.util.List;

public class UserDataService implements IUserDataDto {
    private final IUserDataDao dao;

    public UserDataService(IUserDataDao dao) {
        this.dao = dao;
    }

    @Override
    public void save(UserDataDto usersDataDto) {
        this.validate(usersDataDto);
        SaveUserDataDto saveUserDataDtos = new SaveUserDataDto(usersDataDto);
        this.dao.save(saveUserDataDtos);
    }

    @Override
    public List<UserDataDto> get() {
        return this.dao.get();
    }

    private void validate(UserDataDto userDataDto) {

    }

}
