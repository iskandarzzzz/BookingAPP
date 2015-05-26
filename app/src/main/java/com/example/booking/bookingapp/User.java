package com.example.booking.bookingapp;

/**
 * Created by wahome on 5/24/15.
 */
public class User
{
    String name, email, userName, password;

    //Creating a person
    //Constructor class
    public User(String name, String email, String userName, String password)
    {
        this.name = name;
        this.email = email;
        this.userName = userName;
        this.password = password;

    }

    public User(String userName, String password)
    {
        this.name = "";
        this.email = "";
        this.userName = userName;
        this.password = password;

    }
}
