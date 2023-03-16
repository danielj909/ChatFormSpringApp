package com.udacity.jwdnd.c1.review.models;

public class ChatMessage {

    private Integer messageId;
    private String username;
    private String messageText;


    public Integer getMessageid() {
        return messageId;
    }

    public void setMessageid(Integer messageid) {
        this.messageId = messageid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String message) {
        this.messageText = message;
    }

}
