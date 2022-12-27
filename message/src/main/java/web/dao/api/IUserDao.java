package web.dao.api;

import web.model.User;

import java.util.List;

public interface IUserDao {

    User findByUsername(String login);

    void save(User user);

    List<User> get();
}
