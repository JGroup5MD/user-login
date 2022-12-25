package web.dao;


import web.appuser.UserAccount;
import web.dao.api.IUserDao;
import web.dto.UserDto;
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

    private List<UserDto> usersBase = new ArrayList<>();



    @Override
    public void save(int id, UserDto user, List<Role> role, SimpleDateFormat regDate) {
        this.usersBase.add(user);
    }

    @Override
    public List<UserDto> get() {
        return this.usersBase;
    }

}
