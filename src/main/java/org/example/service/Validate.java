package org.example.service;

import org.example.DAO.UserDAO;
import org.example.DTO.CredentialsDTO;
import org.example.DTO.DatesDTO;
import org.example.DTO.MessageDTO;
import org.example.DTO.UserDTO;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Validate {
    private UserDTO user;
    private UserDAO userDAO;
    private MessageDTO message;
    private CredentialsDTO credentials;


    public void validateUSER(UserDTO user){


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

        if(user.getName()==null||user.getName().isEmpty()){
            throw new IllegalArgumentException("вы не ввели name");
        }
        if(!user.getName().equals(String.format("************ ************ ***************"))){
            throw new IllegalArgumentException("Не корректно ввели  данные о пользователе. " +
                    "Имя пользователя должно содержать имя, фамилию  и отчество");
        }

        if (user.getBirthDate().equals(LocalDate.of(0000,00,00)) ||
                user.getBirthDate()==null){
        throw new IllegalArgumentException("вы не ввели birth date");
    }
    }

    public void validateMessage(MessageDTO message) {
        if(message.getMessage()==null ||message.getMessage().length()<15){
            throw new IllegalArgumentException("Вы пвтаетесь отправить пустое сообщение, сообщение не может быть короче 15 символов");
        }
        if(message.getRecipient()==null){
            throw  new IllegalArgumentException("вы не указали кто будет получателем сообщения");
        }
    }

    public CredentialsDTO validateCREDENTIALS(CredentialsDTO credentials){
        if(!credentials.equals(user.getLogin())){
           throw  new IllegalArgumentException("такого логина - пройдите роцедуру регистрации");
        }
        if (!credentials.equals(user.getPassword())) {
           throw new IllegalArgumentException("такого пароля нет - пройдите роцедуру регистрации");
        }
        return credentials;
    }

}
