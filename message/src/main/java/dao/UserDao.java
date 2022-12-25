package dao;


import appuser.UserAccount;
import dao.api.IUserDao;
import dto.UserDto;
import javax.management.relation.Role;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* 3. При регистрации у пользователя роль Пользователь, зарегистрировать пользователя, значит сохранить данные о нем в приложении
*
* */
//добавить дату регистрации, ид, роль

public class UserDao implements IUserDao {

    private static final Map<String, UserAccount> mapUser = new HashMap<>();

    private List<UserDto> usersDto = new ArrayList<>();

    @Override
    public void save(int id, UserDto user, List<Role> role, SimpleDateFormat regDate) {
        this.usersDto.add(user);
    }

    @Override
    public List<UserDto> get() {
        return this.usersDto;
    }

}
