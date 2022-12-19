package org.example.DTO;

public class MessageDTO {
    public int DateOfSent;
    public String sender;

    public UserDTO recipient;
    public  String message;

    public MessageDTO(int dateOfSent, String sender, UserDTO recipient, String message) {
        DateOfSent = dateOfSent;
        this.sender = sender;
        this.recipient = recipient;
        this.message = message;
    }
}
