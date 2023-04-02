package com.example.bandross;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private EditText et_fullname, et_username, et_email, et_password, et_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et_fullname = findViewById(R.id.inputbox_fullname);
        et_username = findViewById(R.id.inputbox_username);
        et_email = findViewById(R.id.inputbox_email);
        et_password = findViewById(R.id.inputbox_password);
        et_phone = findViewById(R.id.inputbox_phone);

        Button btn_signup = findViewById(R.id.button_signup);
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullname = et_fullname.getText().toString();
                String username = et_username.getText().toString();
                String email = et_email.getText().toString();
                String password = et_password.getText().toString();
                String phone = et_phone.getText().toString();

                ProfileFragment profileFragment = new ProfileFragment();
                Bundle bundle = new Bundle();
                bundle.putString("i_fullname", fullname);
                bundle.putString("i_username", username);
                bundle.putString("i_email", email);
                bundle.putString("i_password", password);
                bundle.putString("i_phone", phone);
                profileFragment.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, profileFragment).commit();


            }
        });

    }
}