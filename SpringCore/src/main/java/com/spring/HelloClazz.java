package com.spring;

public class HelloClazz {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage(){
        System.out.println("Your message " + message);
    }
}
