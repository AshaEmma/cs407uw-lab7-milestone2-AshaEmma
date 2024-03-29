package com.cs407.lab7_milestone2;

public class NotificationItem {

    private String sender = null;
    private String message = null;
    private int id = -1;

    public NotificationItem(String sender, String message, int id){
        this.sender = sender;
        this.message = message;
        this.id = id;
    }

    public String getSender(){
        return sender;
    }

    public String getMessage(){
        return message;
    }

    public int getId(){
        return id;
    }
}
