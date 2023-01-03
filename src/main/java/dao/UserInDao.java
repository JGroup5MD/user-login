package dao;

import dao.api.IUserInDao;
import dto.UserInDto;

import java.util.ArrayList;
import java.util.List;

public class UserInDao implements IUserInDao {

    private List<UserInDto> userInDtos = new ArrayList<>();

    @Override
    public void save(UserInDto userIn) {

    }

    @Override
    public List<UserInDto> get() {
        return null;
    }


}
