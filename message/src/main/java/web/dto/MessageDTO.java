package web.dto;

import java.time.LocalDateTime;
import java.util.Date;

public class MessageDTO {
    private int id;
    private String sender;
    private String receiver;
    private String text;
    private LocalDateTime date;

    public MessageDTO(String sender, String receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiverID) {
        this.receiver = receiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
