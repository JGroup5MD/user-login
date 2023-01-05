package org.example.DAO;

import org.example.DAO.API.IUserAndRoleRegistrationDAO;
import org.example.DTO.MessageDTO;
import org.example.DTO.UserAndRoleRegistration;
import org.example.DTO.UserDTO;
import org.example.DTO.UserRole;

import java.time.LocalDate;
import java.util.*;


public class UserAndRoleRegistrationDAO implements IUserAndRoleRegistrationDAO {

    @Override
    public UserDTO createdADMIN() {
        Map<Integer, UserAndRoleRegistration> userMap = new HashMap<>();
        final UserDTO ADMIN = new UserDTO("admin", "1A11aDMin11A1",
                "admin", "admin", "admin",
                LocalDate.of(2022, 12, 28));
        final UserAndRoleRegistration registrationAdmin = new UserAndRoleRegistration(ADMIN, UserRole.admin, LocalDate.now());
        userMap.put(1, registrationAdmin);
        return ADMIN;
    }
    @Override
    public Map<Integer, UserAndRoleRegistration> addUsers(UserDTO udto) {
        Map<Integer, UserAndRoleRegistration> userMap = new HashMap<>();
        String login=udto.getLogin();
        String password= udto.getPassword();
        String FirstName= udto.getFirstName();
        String MidlName=udto.getMidlName();
        String LastName= udto.getLastName();
        LocalDate birthDate=udto.getBirthDate();
        UserAndRoleRegistration registrationUser=new UserAndRoleRegistration((new UserDTO(login,password,FirstName,MidlName,LastName,birthDate)),UserRole.user,LocalDate.now());
        for (Integer key : userMap.keySet()) {
            userMap.put(key, registrationUser);
    }
        return userMap;
}
    @Override
    public Map<Integer, UserAndRoleRegistration> getAllUsers(){
        Map<Integer, UserAndRoleRegistration> userMap = new HashMap<>();
        return userMap;
    }
    @Override
    public  Map<Integer, UserAndRoleRegistration> deliteAnyUser(int key) {
        Map<Integer, UserAndRoleRegistration> userMap = new HashMap<>();
        userMap.remove(key);
        return userMap;
    }

    @Override
    public UserAndRoleRegistration deleteUser(String login, UserAndRoleRegistration user) {
        Map<Integer, UserAndRoleRegistration> userMap = new HashMap<>();
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
        if(UserAndRoleRegistrationDAO.this.createdADMIN().getLogin().equals(loginADMIN)
        && UserAndRoleRegistrationDAO.this.createdADMIN().getPassword().equals(passwordADMIN)){
            role=UserRole.admin;
        }else {
            role=UserRole.user;
        }
        return role;
    }

    public long countALLUser(Map<Integer, UserAndRoleRegistration> userMap, long count){
        if (userMap.isEmpty()){
            count=0;
        }
        for(Map.Entry<Integer,UserAndRoleRegistration> item:userMap.entrySet()){
            if (item!=null){
                count++;
            }
        }
        return count;
    }

   }

