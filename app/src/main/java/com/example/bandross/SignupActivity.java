package com.example.bandross;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {

    private EditText et_fullname, et_username, et_email, et_password, et_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        et_fullname = findViewById(R.id.inputbox_fullname);
        et_username = findViewById(R.id.inputbox_username);
        et_email = findViewById(R.id.inputbox_email);
        et_password = findViewById(R.id.inputbox_password);
        et_phone = findViewById(R.id.inputbox_phone);

        Button btn_signup = findViewById(R.id.button_signup);
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullName = et_fullname.getText().toString();
                String username = et_username.getText().toString();
                String email = et_email.getText().toString();
                String password = et_password.getText().toString();
                String phoneNumber = et_phone.getText().toString();

                Intent intent = new Intent(getBaseContext(), NavigationActivity.class);
                // Pass data
                intent.putExtra("username", username);
                intent.putExtra("email", email);
                intent.putExtra("fullName", fullName);
                intent.putExtra("password", password);
                intent.putExtra("phoneNumber", phoneNumber);
                startActivity(intent);

            }
        });

    }
}