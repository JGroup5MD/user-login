package dao;


import java.text.SimpleDateFormat;
import java.util.SimpleTimeZone;

public class Users {
    private String name;
    private String lastname;
    private String middlename;
    private SimpleDateFormat dateOfBirth;
    private SimpleDateFormat dateOfReg;
    private String role;
    private long id;


    public Users(String name, String lastname, String middlename,
                 SimpleDateFormat dateOfBirth, SimpleDateFormat dateOfReg,
                 String role, long id) {
        this.name = name;
        this.lastname = lastname;
        this.middlename = middlename;
        this.dateOfBirth = dateOfBirth;
        this.dateOfReg = dateOfReg;
        this.role = role;
        this.id = id;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
