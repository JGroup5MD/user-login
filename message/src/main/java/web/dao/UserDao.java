package web.dao;


import web.appuser.UserAccount;
import web.dao.api.IUserDao;
import web.dto.NewUserDto;
import web.model.User;

import java.util.*;

/*
* 3. При регистрации у пользователя роль Пользователь, зарегистрировать пользователя, значит сохранить данные о нем в приложении
*
* */
//добавить дату регистрации, ид, роль

public class UserDao implements IUserDao {

    private static final Map<String, UserAccount> mapUser = new HashMap<>();



    @Override
    public User findByUsername(String login) {
        return null;
    }

    @Override
    public void save(User user) {

    }




    @Override
    public List<User> get() {
        return this.users;
    }


    private List<User> users = new ArrayList<User>();

    public UserDao(List<User> users) {
        this.users = users;
    }


}
