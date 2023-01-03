package dao;

import dao.api.IUserDataDao;
import dto.SaveUserDataDto;
import dto.UserDataDto;

import java.util.ArrayList;
import java.util.List;

public class UserDataDao implements IUserDataDao {

    private List<UserDataDto> userDataDtos = new ArrayList<>();

    @Override
    public void save(SaveUserDataDto userData) {

    }

    @Override
    public List<UserDataDto> get() {
        return this.userDataDtos;
    }
}
