package org.example.dao;

import org.example.DTO.Dates;
import org.example.DTO.UserDTO;
import org.example.dao.API.IUserDAO;
import java.util.HashMap;
import java.util.Map;


public class UserDAO implements IUserDAO {
    private Map<Integer, UserDTO> mapUser=new HashMap<>();

    @Override
    public void add() {
        UserDTO userDTO=new UserDTO("", " "," ", new Dates(0,0,0), new Dates(0,0,0));
        this.mapUser.put(1, new UserDTO("admin", "1111",
                "Шадрин Илья",
                new Dates(1998,10,12),
                new Dates(2022,12,18)));
    }
    @Override
    public  Map<Integer, UserDTO> deliteUserFromMap(int key) {
        Map<Integer, UserDTO>  deleted=new HashMap<>();
        deleted.entrySet().removeIf(e->e.getKey()==key);
        return deleted;
    }

    @Override
    public Map<Integer, UserDTO> getMapUser() {
        add();
        return this.mapUser;
    }
}

