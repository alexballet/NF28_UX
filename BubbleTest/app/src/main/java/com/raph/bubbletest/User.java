package com.raph.bubbletest;

import java.util.List;

/**
 * Created by Alxd on 15/05/2017.
 */

public class User {

    private String userId;

    private String firstName;

    private String lastName;

    private String username;

    private String email;

    private List<Lock> ownLocks;

    private List<User> contacts;

    public User(String userId, String firstName, String lastName, String username, String email) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Lock> getOwnLocks() {
        return ownLocks;
    }

    public void setOwnLocks(List<Lock> ownLocks) {
        this.ownLocks = ownLocks;
    }

    public List<User> getContacts() {
        return contacts;
    }

    public void setContacts(List<User> contacts) {
        this.contacts = contacts;
    }
}
