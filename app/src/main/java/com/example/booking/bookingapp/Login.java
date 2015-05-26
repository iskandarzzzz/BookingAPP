package com.example.booking.bookingapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Login extends ActionBarActivity implements View.OnClickListener
{

    Button bLogin;
    EditText userName,password;
    TextView registerLink;
    UserSave userSave;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = (EditText) findViewById(R.id.userName);
        password = (EditText) findViewById(R.id.password);
        bLogin = (Button) findViewById(R.id.bLogin);
        registerLink = (TextView) findViewById(R.id.registerLink);

        bLogin.setOnClickListener(this);
        registerLink.setOnClickListener(this);

        userSave = new UserSave(this);
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.bLogin:

                User this_user = new User(null, null);
                userSave.storeUserData(this_user);
                userSave.setUserLoggedIn(true);
                startActivity(new Intent(this, MainActivity.class));
                break;

            case R.id.registerLink:
                //Start the register activity when the register button is clicked
                startActivity(new Intent(this, Register.class));
                break;

        }

    }
}
