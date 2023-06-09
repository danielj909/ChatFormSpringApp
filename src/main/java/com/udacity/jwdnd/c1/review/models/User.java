package com.udacity.jwdnd.c1.review.models;

public class User {

    private Integer userId;
    private String username;
    private String salt;
    private String password;
    private String firstName;
    private String lastName;

    public User(Integer userid, String username, String salt, String password, String firstname, String lastname) {
        this.userId = userid;
        this.username = username;
        this.salt = salt;
        this.password = password;
        this.firstName = firstname;
        this.lastName = lastname;
    }

    public Integer getUserid() {
        return userId;
    }

    public void setUserid(Integer userid) {
        this.userId = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }
}
