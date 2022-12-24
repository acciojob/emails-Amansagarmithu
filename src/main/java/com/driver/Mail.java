package com.driver;
import java.util.*;
public class Mail {
    private Date date;
    private String sender;
    private String message;

    public Mail(Date date,String sender,String messege) {
        this.date = date;
        this.sender = sender;
        this.message = messege;
    }

    public Date getDate() {
        return date;
    }

    public String getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }
}
