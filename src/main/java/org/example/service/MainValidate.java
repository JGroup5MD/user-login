package org.example.service;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.example.DTO.UserAndRoleRegistration;

import java.time.LocalDate;
public class MainValidate extends ActionSupport{
    private  String login;
    private  String password;
    private  String FirstName;
    private String MidlName;
    private  String LastName;
    private LocalDate birthDate;
    private String loginIn;
    private String passwordIn;
    private String sender;
    private String recipient;
    private  String message;
    private UserAndRoleRegistration UserRole;
     @Override
     public String execute(){
        /*
         * возможные ошибки при вводе данных в поле FirstName
         */
        if ( getFirstName().trim().length()<2
          || getFirstName().trim().length()>20
          || !getFirstName().trim().matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[а-я])(?=.*[А-Я])")
          || getFirstName()==null
          || getFirstName().trim().isEmpty()){
            return Action.SUCCESS;
    }
        /*
         * возможные ошибки при вводе данных в поле MidlName
         */
        if ( getMidlName().length()<2
          || getMidlName().trim().length()>20
          || !getMidlName().trim().matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[а-я])(?=.*[А-Я])")
          || getMidlName()==null
          || getMidlName().trim().isEmpty()){
        return Action.SUCCESS;
    }
        /*
         * возможные ошибки при вводе данных в поле FLastName
         */
        if ( getLastName().length()<2
          || getLastName().trim().length()>20
          || !getLastName().trim().matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[а-я])(?=.*[А-Я])")
          || getLastName()==null
          || getLastName().trim().isEmpty()){
            return Action.SUCCESS;
    }
        /*
         * возможные ошибки при вводе данных в поле Login
         */
        if ( getLogin()==null
          || getLogin().trim().length()<5
          || getLogin().trim().length()>20
          || !getLogin().trim().matches("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[а-я])(?=.*[А-Я])+")){
            return Action.SUCCESS;
    }
        /*
         * возможные ошибки при вводе данных в поле Password
         */
        if( getPassword()==null
         || getPassword().trim().length()<7
         || getPassword().trim().length()>20
         || !getPassword().trim().matches("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[а-я])(?=.*[А-Я])+")){
        return Action.SUCCESS;
    }
        /*
         * возможные ошибки при вводе данных в поле BirthDate
         */
        if( getBirthDate()==null){
            return Action.SUCCESS;
    }
        /*
         * возможные ошибки при вводе данных в поле LoginI при авторизации
         */
        if( getLoginIn()==null
         || !getLoginIn().equals(login)){
            return Action.SUCCESS;
    }
        /*
         * возможные ошибки при вводе данных в поле Password при авторизации
         */
        if( getPasswordIn()==null
         || !getPasswordIn().equals(password)){
            return Action.SUCCESS;
    }
        /*
         * возможные ошибки при отправке текста сообщения
         */
        if( getMessage().isBlank()
         && getMessage()==null
         && getMessage().length()<15){
            return Action.SUCCESS;
    }
        /*
         * возможные ошибки при отправке сообщения
         * при указании получателя сообщения
         */
        if( getRecipient()==null
         && getRecipient().isBlank()){
            return Action.SUCCESS;
    }

        return Action.INPUT;
}
    @Override
    public void validate(){
        if(FirstName.isEmpty()){
            addFieldError("FirstName","поле FirstName не заполнено");
        }
        if(FirstName.trim().length()<5 || FirstName.length()<20){
            addFieldError("FirstName","длинна атрибута FirstName может быть от 5 до 20 символов");
        }
        if(!FirstName.trim().matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[а-я])(?=.*[А-Я])")){
            addFieldError("FirstName","для ввода используйтель только буквы");
       }

        if(MidlName.isEmpty()){
            addFieldError("FirstName","поле MidlName не заполнено");
        }
        if(MidlName.trim().length()<5 || MidlName.length()<20){
            addFieldError("MidlName","длинна атрибута MidlName может быть от 5 до 20 символов");
        }
        if(!MidlName.trim().matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[а-я])(?=.*[А-Я])")){
            addFieldError("MidlName","для ввода используйтель только буквы");
        }

        if(LastName.isEmpty()){
            addFieldError("LastName","поле LastName не заполнено");
        }
        if(LastName.trim().length()<5 || LastName.length()<20){
            addFieldError("LastName","длинна атрибута LastName может быть от 5 до 20 символов");
        }
        if(!LastName.trim().matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[а-я])(?=.*[А-Я])")){
            addFieldError("LastName","для ввода используйтель только буквы");
        }

        if(birthDate==null){
            addFieldError("birthDate","поле birthDate не заполнено");
        }

        if(login==null){
            addFieldError("login", "поле login не заполнено");
        }
        if(login.trim().length()<5||login.trim().length()>20){
            addFieldError("login","длинна атрибута login должна быть от 5 до 20 символов");
        }
        if(!login.trim().matches("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[а-я])(?=.*[А-Я])+")){
            addFieldError("login","для ввода ипользуйте только буквы и цифры");
        }

        if(password==null){
            addFieldError("password","поле password не заполнено");
        }
        if(password.trim().length()<7||password.trim().length()<20){
            addFieldError("password","длинна атрибута password должна быть от 7 до 20 символов");
        }
        if(!password.trim().matches("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[а-я])(?=.*[А-Я])+")){
            addFieldError("password","для ввода ипользуйте только буквы и цифры");
        }

        if(message==null){
            addFieldError("message","вы пытаетесь отправить пустое сообщение");
        }
        if(message.length()<15){
            addFieldError("message","длинна сообщения не может быть короче 15 символов");
        }

        if(recipient==null){
            addFieldError("recipient","поле recipient должно быть заполненым");
        }


        if(!loginIn.equals(login)&& loginIn.length()==0){
            addActionError("такого login не существует, введите корректный loginIn");
        }

        if(!passwordIn.equals(password)&&passwordIn.length()==0){
            addActionError("такого password не существует, введите корректный password");
    }

        if(UserRole.getRole()==null){
            addActionMessage("регистрация не завершена - вам не присвоен статус (пользователь / администратор)," +
                    " пройдите  процесс регистрации ");
        }
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public String getMidlName() {
        return MidlName;
    }
    public void setMidlName(String midlName) {
        MidlName = midlName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public String getLoginIn() {
        return loginIn;
    }
    public void setLoginIn(String loginIn) {
        this.loginIn = loginIn;
    }
    public String getPasswordIn() {
        return passwordIn;
    }
    public void setPasswordIn(String passwordIn) {
        this.passwordIn = passwordIn;
    }
    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }
    public String getRecipient() {
        return recipient;
    }
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public UserAndRoleRegistration getUserRole() {
        return UserRole;
    }
    public void setUserRole(UserAndRoleRegistration userRole) {
        UserRole = userRole;
    }

}
