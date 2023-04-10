package com.example.bandross;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button_signin, button_signup;
    private EditText editText_username, editText_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText_username = (EditText) findViewById(R.id.inputbox_username);
        editText_password = (EditText) findViewById(R.id.inputbox_password);

        button_signin = (Button) findViewById(R.id.button_signin);
        button_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), NavigationActivity.class);
                // Pass data
                String username = editText_username.getText().toString();
                intent.putExtra("username", username);
                startActivity(intent);
            }
        });

        button_signup = (Button) findViewById(R.id.btn_signup);
        button_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), SignupActivity.class);
                startActivity(intent);
            }
        });
    }
}