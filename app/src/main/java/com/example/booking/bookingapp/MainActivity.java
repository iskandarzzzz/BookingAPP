package com.example.booking.bookingapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements View.OnClickListener
{
    Button bLogout,bSearch;
    EditText name, email, userName;

    UserSave userSave;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.name);
        email= (EditText) findViewById(R.id.email);
        userName =(EditText) findViewById(R.id.userName);
        bLogout = (Button) findViewById(R.id.bLogout);
        bSearch = (Button) findViewById(R.id.bSearch);

        bLogout.setOnClickListener(this);
        bSearch.setOnClickListener(this);

        //Give the UserSave method a local context
        userSave = new UserSave(this);
    }

    @Override
    protected  void onStart()
    {
        super.onStart();

        if(authenticate()==true)
        {
            //displayUserDetails();
        }
    }

    private boolean authenticate()
    {
        return userSave.getLoggedIn();
    }

    private void displayUserDetails()
    {
        User user = userSave.getLoggedInUser();
        userName.setText(user.userName);
        name.setText(user.name);
        email.setText(user.email);

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.bLogout:
                userSave.clearUserData();
                userSave.setUserLoggedIn(false);
                //Start the login activity when the login button is clicked
                startActivity(new Intent(this, Login.class));
                break;

            case R.id.bSearch:

                startActivity(new Intent(this, Booking.class));
                break;
        }
    }
}
