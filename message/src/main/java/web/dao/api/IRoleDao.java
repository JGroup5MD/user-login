package web.dao.api;

import web.model.Role;

import java.util.List;

public interface IRoleDao {
    List<Role> get();

    void save(int id, String name);
}
