package com.example.booking.bookingapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Booking extends ActionBarActivity implements View.OnClickListener
{
    Button bBook;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        bBook= (Button) findViewById(R.id.bBook);
        bBook.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.bBook:
                startActivity(new Intent(this, Payment.class));
                break;

        }

    }
}
