package com.example.booking.bookingapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Register extends ActionBarActivity implements View.OnClickListener
{
    Button bRegister;
    EditText name, email, userName, password;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = (EditText) findViewById(R.id.name);
        email= (EditText) findViewById(R.id.email);
        userName =(EditText) findViewById(R.id.userName);
        password = (EditText) findViewById(R.id.password);
        bRegister = (Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.bRegister:
                String the_name = name.getText().toString();
                String the_email = email.getText().toString();
                String the_username = userName.getText().toString();
                String the_password = password.getText().toString();

                //Int phone = Integer.parseInt(phone.getText().toString());
                User registrationData = new User(the_name,the_email,the_username,the_password);

                break;

        }

    }
}
