package org.example.DTO;

import java.time.LocalDateTime;
import java.util.Objects;

public class MessageDTO  {

    private String sender;
    private String recipient;
    private  String message;
    private LocalDateTime timeSending;

    public MessageDTO(String sender, String recipient,
                      String message, LocalDateTime timeSending) {
        this.sender = sender;
        this.recipient = recipient;
        this.message = message;
        this.timeSending = timeSending;
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

    public LocalDateTime getTimeSending() {
        return timeSending;
    }

    public void setTimeSending(LocalDateTime timeSending) {
        this.timeSending = timeSending;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageDTO that = (MessageDTO) o;
        return Objects.equals(sender, that.sender) && Objects.equals(recipient, that.recipient) && Objects.equals(message, that.message) && Objects.equals(timeSending, that.timeSending);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, recipient, message, timeSending);
    }

    @Override
    public String toString() {
        return "MessageDTO{" +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", message='" + message + '\'' +
                ", timeSending=" + timeSending +
                '}';
    }
}



