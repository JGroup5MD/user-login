package org.example.service;

import org.example.DTO.MessageDTO;
import org.example.DTO.UserAndRoleAndDateRegistration;
import org.example.DTO.UserDTO;
import org.example.service.API.ILoginService;
import org.example.service.API.IValidate;
import java.util.regex.Pattern;

public class Validate implements IValidate {

    private final MessageDTO message;
    private final ILoginService is;
    private  final UserDTO user;
    private final UserAndRoleAndDateRegistration userRegistration;

    public Validate(MessageDTO message,ILoginService is, UserDTO user, UserAndRoleAndDateRegistration userRegistration) {
        this.message=message;
        this.is = is;
        this.user = user;
        this.userRegistration=userRegistration;
    }
    public void validateUSER(){
        if(user.getLogin()==null||user.getLogin().isEmpty()){
            throw new IllegalArgumentException("вы не ввели login");
        }
        if(user.getLogin().length()<5){
            throw new IllegalArgumentException("login не может быть короче 5 символов");
        }
        if(user.getLogin().isBlank()){
            throw new IllegalArgumentException("login не может содеражать пробелы");
        }
        if(user.getPassword()==null||user.getPassword().isEmpty()){
            throw new IllegalArgumentException("вы не ввели password");
        }
        if(user.getPassword().length()<7){
            throw new IllegalArgumentException("password не может быть короче 7 символов ");
        }
        if(!Pattern.matches("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[а-я])(?=.*[А-Я])+", user.getPassword())){
            throw new IllegalArgumentException("Не корректный password." +
                    " Допускается использовать  только цифры а также  заглавные и прописные буквы алфавитов");
        }
        if(user.getFirstName()==null||user.getFirstName().isEmpty()){
            throw new IllegalArgumentException("не введен парметр FirstName");
        }

        if(user.getMidlName()==null||user.getMidlName().isEmpty()){
            throw new IllegalArgumentException("не введен парметр MidlName");
        }

        if(user.getLastName()==null||user.getLastName().isEmpty()){
            throw new IllegalArgumentException("не введен парметр LastName");
        }
        if(user.getFirstName().length()<2 && user.getFirstName().length()>20
                || user.getMidlName().length()<2 && user.getMidlName().length()>20
                || user.getLastName().length()<2 && user.getLastName().length()>20){
            throw new IllegalArgumentException("Не корректно введены  данные о пользователе. Каждый параметр имени должен быть от 3 до 20 символов");
        }
        if (user.getBirthDate()==null ){
        throw new IllegalArgumentException("вы не ввели birth date");
    }
    }

    public void validateMessage() {
        if(message.getMessage()==null ||message.getMessage().length()<15){
            throw new IllegalArgumentException("Вы пытаетесь отправить пустое сообщение, сообщение не может быть короче 15 символов");
        }
        if(message.getRecipient()==null){
            throw  new IllegalArgumentException("вы не указали кто будет получателем сообщения");
        }
    }

    public String informValidLogin(String login){
        return is.markerLogin(login)? "login is correct" : "Error 404, incorrect login" ;
    }
    public String informValidPassword(String password) {
        return is.markerPassword(password) ? "password is correct" : "Error 404, incorrect password";
    }

    public void validateUserAndRole(){
        if(userRegistration.getTimeRegistration()==null
                ||userRegistration.getUserDTO()==null
                || userRegistration.getRole()==null){
            throw new IllegalArgumentException("регистрация не завершена");
    }
    }
}



