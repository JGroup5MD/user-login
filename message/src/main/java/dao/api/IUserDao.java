package dao.api;

import dto.UserDto;

import javax.management.relation.Role;
import java.text.SimpleDateFormat;
import java.util.List;

public interface IUserDao {

    void save(int id, UserDto user, List<Role> role, SimpleDateFormat regDate);

    List<UserDto> get();
}
