package org.example.DAO;

import org.example.DAO.API.IUserDAO;
import org.example.DTO.UserAndRoleRegistration;
import org.example.DTO.UserDTO;
import org.example.DTO.UserRole;

import java.time.LocalDate;
import java.util.*;


public class UserDAO implements IUserDAO {
    private final UserDTO udto;

    public UserDAO(UserDTO udto) {
        this.udto = udto;
    }

    private final Map<Integer, UserAndRoleRegistration> userMap = new HashMap<>();
    @Override
    public UserDTO createdADMIN() {
        final UserDTO ADMIN = new UserDTO("admin", "1111admin1111",
                "admin", "admin", "admin",
                LocalDate.of(2022, 12, 28));
        final UserAndRoleRegistration registrationAdmin = new UserAndRoleRegistration(ADMIN, UserRole.admin, LocalDate.now());
        this.userMap.put(1, registrationAdmin);
        return ADMIN;
    }
    @Override
    public void addUsers() {
        String login=udto.getLogin();
        String password= udto.getPassword();
        String FirstName= udto.getFirstName();
        String MidlName=udto.getMidlName();
        String LastName= udto.getLastName();
        LocalDate birthDate=udto.getBirthDate();
        UserAndRoleRegistration registrationUser=new UserAndRoleRegistration((new UserDTO(login,password,FirstName,MidlName,LastName,birthDate)),UserRole.user,LocalDate.now());
        for (Integer key : userMap.keySet()) {
            this.userMap.put(key, registrationUser);
    }
}
    @Override
    public Map<Integer, UserAndRoleRegistration> getAllUsers(){
        return this.userMap;
    }
    @Override
    public  void deliteAnyUser(int key) {
        userMap.remove(key);
    }
    @Override
    public UserAndRoleRegistration deleteUser(String login, UserAndRoleRegistration user) {
        String FirstName=user.getUserDTO().getFirstName();
        String MidlName=user.getUserDTO().getMidlName();
        String LastName=user.getUserDTO().getLastName();
        String fullName=FirstName+" "+MidlName+" "+LastName;
        if(login!=null&&user.getUserDTO().getLogin()!=null) {
            userMap.values().removeIf(a -> a.getUserDTO().getLogin().equals(login));
        }
        for(Map.Entry<Integer,UserAndRoleRegistration> item:userMap.entrySet()){
            if(fullName.equals((item.getValue().getUserDTO().getFirstName())+" "+
                    (item.getValue().getUserDTO().getMidlName())+" "+(item.getValue().getUserDTO().getLastName()))){
                return userMap.remove(item.getKey());
            }
        }return null;
    }

    public  UserRole role(String loginADMIN, String passwordADMIN, UserRole role){
        if(UserDAO.this.createdADMIN().getLogin().equals(loginADMIN)
        && UserDAO.this.createdADMIN().getPassword().equals(passwordADMIN)){
            role=UserRole.admin;
        }else {
            role=UserRole.user;
        }
        return role;
    }

   }

