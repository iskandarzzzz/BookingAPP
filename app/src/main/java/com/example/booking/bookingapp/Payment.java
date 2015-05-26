package com.example.booking.bookingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by wahome on 5/25/15.
 */
public class Payment extends ActionBarActivity implements View.OnClickListener
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }

    public void makePayment(View view) {
        Intent intent = new Intent();
        intent.putExtra("Extra", "use this intent");
        intent.setAction("com.booking.action.PAY");
        sendBroadcast(intent);
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.bPayment:
                startActivity(new Intent(this, MainActivity.class));
                break;

            case R.id.registerLink:
                //Start the register activity when the register button is clicked
                startActivity(new Intent(this, Register.class));
                break;

        }

    }

}
