package org.example.DAO;

import org.example.DAO.API.IUserDAO;
import org.example.DTO.DatesDTO;
import org.example.DTO.UserDTO;
import org.example.DTO.ActivUserSession;
import org.example.DTO.UserRole;

import java.time.LocalDate;
import java.util.*;


public class UserDAO implements IUserDAO {

    private final Map<Integer, UserDTO.UserBuilder> userMap = new HashMap<>();

    public UserDAO() {
        final UserDTO.UserBuilder ADMIN=new UserDTO.UserBuilder();
        add("admin", "1111admin1111", "admin", "admin", "admin", 111, UserRole.admin);
        userMap.put(1, ADMIN);
    }

    @Override
    public  List<UserDTO> add(String login,
                    String password,
                    String FirstName,
                    String MidlName,
                    String LastName,
                    DatesDTO birthDate,
                    UserRole role) {

         List<UserDTO> BaseUser=new ArrayList<>();

         for(UserDTO item: BaseUser){
             if(!login.equals(BaseUser.contains(login))&&
                !password.equals(BaseUser.contains(password)) &&
                !FirstName.equals(BaseUser.contains(FirstName))&&
                !MidlName.equals(BaseUser.contains(MidlName))&&
                !LastName.equals(BaseUser.contains(LastName))&&
                !birthDate.equals(BaseUser.contains(birthDate))&&
                !role.equals(BaseUser.contains(role))){
                 BaseUser.add(item);
             }
         }
         return BaseUser;
    }
    @Override
    public List<UserDTO> getAllUser(List<UserDTO> allUser){
        return allUser;
    }

    @Override
    public  Map<Integer, UserDTO.UserBuilder> deliteUserFromMap(int key) {
        Map<Integer, UserDTO.UserBuilder> mapAutoDelete=new HashMap<>();
        mapAutoDelete.entrySet().removeIf(e->e.getKey()==key);
        return mapAutoDelete;
    }

    @Override
    public Map<Integer, UserDTO.UserBuilder> getMapOfUser(Map<Integer, UserDTO.UserBuilder> userMap) {
        return this.userMap;
    }


    @Override
    public void deleteUser(int id, String login) {
        Object desiredObject=new Object();
        Iterable<? extends Map.Entry<Integer, UserDTO.UserBuilder>> entrySet = null;
        for (Map.Entry<Integer,UserDTO.UserBuilder> pair : entrySet) {
            if (desiredObject.equals(pair.getValue())) {
                userMap.remove(id, login);
            }
        }
     }

    public  UserRole Role(UserRole role){
        if(!userMap.containsKey(1)||userMap.containsValue("1111admin1111")){
            role=UserRole.user;
        }else {
            role=UserRole.admin;
        }
        return role;
    }
    public ActivUserSession initSessionUser(ActivUserSession userSession){
        return new ActivUserSession(userSession.getLogin(), userSession.getPassword(),
               UserRole.user,userSession.getTimeStartSession());
    }
   }

