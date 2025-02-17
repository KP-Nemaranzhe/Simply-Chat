package com.example.simply_chat_demo;

//This class will be a POJO - Plain Old Java Object
public class Message {
    //Initialize the variables
    private String user;
    private String message;

    //Default Constructor
    public Message(){}
    //Constructor
    public Message(String user, String message){
        this.user = user;
        this.message = message;
    }

    //getter Method
    public String getUser(){return user;}
    public String getMessage(){return message;}


}