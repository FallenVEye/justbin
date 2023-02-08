package com.justtown.justbin;

public class MessageNotFoundException extends Exception {
    public MessageNotFoundException(String id) {
        super("Could not find message " + id);
    }
}
