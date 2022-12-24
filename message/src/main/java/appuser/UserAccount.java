package appuser;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserAccount implements IUserAccount{
    private String name;
    private String lastname;
    private String middlename;
    private SimpleDateFormat dateOfBirth;
    private SimpleDateFormat dateOfReg;
    private List<String> role;
    private long id;

    private String login;


    public UserAccount(String name, String lastname, String middlename,
                    SimpleDateFormat dateOfBirth, SimpleDateFormat dateOfReg,
                    String[] role, long id) {
        this.name = name;
        this.lastname = lastname;
        this.middlename = middlename;
        this.dateOfBirth = dateOfBirth;
        this.dateOfReg = dateOfReg;
        this.id = id;

        this.role = new ArrayList<String>();
            if(role != null){
                for(String r : role){
                    this.role.add(r);
                }
            }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public SimpleDateFormat getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(SimpleDateFormat dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public SimpleDateFormat getDateOfReg() {
        return dateOfReg;
    }

    public void setDateOfReg(SimpleDateFormat dateOfReg) {
        this.dateOfReg = dateOfReg;
    }

    public List<String> getRole() {
        return role;
    }

    public void setRole(List<String> role) {
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }
}
