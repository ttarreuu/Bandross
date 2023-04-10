package com.example.bandross;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FinalTicketActivity extends AppCompatActivity {
    String name, date, time, type, passenger;
    TextView tv_name, tv_date, tv_time, tv_type, tv_passenger, tv_totalPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_ticket);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        date = intent.getStringExtra("date");
        time = intent.getStringExtra("time");
        type = intent.getStringExtra("type");
        passenger = intent.getStringExtra("passenger");

        tv_name = (TextView) findViewById(R.id.inputbox_name);
        tv_date = (TextView) findViewById(R.id.inputbox_date);
        tv_time = (TextView) findViewById(R.id.inputbox_time);
        tv_type = (TextView) findViewById(R.id.inputbox_type);
        tv_passenger = (TextView) findViewById(R.id.inputbox_passenger);
        tv_totalPrice = (TextView) findViewById(R.id.inputbox_totalprice);

        tv_name.setText(name);
        tv_date.setText(date);
        tv_time.setText(time);
        tv_type.setText(type);
        tv_passenger.setText(passenger);
        // too lazy to handle input format, assume passenger is int parsable
        tv_totalPrice.setText(Integer.toString(20000*(Integer.parseInt(passenger))));
    }
}