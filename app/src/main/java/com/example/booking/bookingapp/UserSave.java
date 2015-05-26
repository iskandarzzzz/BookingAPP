package com.example.booking.bookingapp;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by wahome on 5/24/15.
 */
public class UserSave
{
    public static final String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabase;

    //Constructor class
    public UserSave(Context context)
    {
        userLocalDatabase = context.getSharedPreferences(SP_NAME, 0);

    }

    public void storeUserData(User user)
    {
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putString("name", user.name);
        spEditor.putString("email", user.email);
        spEditor.putString("username", user.userName);
        spEditor.putString("password", user.password);
        spEditor.commit();

    }

    //The reason for User is because this method need to return a user
    public User getLoggedInUser()
    {
        String name = userLocalDatabase.getString("name", "");
        String email = userLocalDatabase.getString("email","");
        String username = userLocalDatabase.getString("username","");
        String password = userLocalDatabase.getString("password","");

        User storedUser = new User(name,email,username,password);
        return storedUser;//Return the created user
    }

    public void setUserLoggedIn(boolean loggedIn)
    {
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putBoolean("loggedIn", loggedIn);
        spEditor.commit();
    }

    public boolean getLoggedIn()
    {
        if(userLocalDatabase.getBoolean("loggedIn", false) == true)
        {
            return true;
        }

        else
        {
            return false;
        }

    }

    public void clearUserData()
    {
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.clear();
        spEditor.commit();

    }
}
