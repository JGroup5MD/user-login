package org.example.DTO;

import java.util.Objects;

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

    public int getDateOfSent() {
        return DateOfSent;
    }

    public void setDateOfSent(int dateOfSent) {
        DateOfSent = dateOfSent;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public UserDTO getRecipient() {
        return recipient;
    }

    public void setRecipient(UserDTO recipient) {
        this.recipient = recipient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageDTO that = (MessageDTO) o;
        return DateOfSent == that.DateOfSent && Objects.equals(sender, that.sender) && Objects.equals(recipient, that.recipient) && Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DateOfSent, sender, recipient, message);
    }

    @Override
    public String toString() {
        return "MessageDTO{" +
                "DateOfSent=" + DateOfSent +
                ", sender='" + sender + '\'' +
                ", recipient=" + recipient +
                ", message='" + message + '\'' +
                '}';
    }
}
