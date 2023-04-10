package com.example.bandross;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class NavigationActivity extends AppCompatActivity {

    BottomNavigationView bottomNav;
    String fullName, username, email, password, phoneNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        Intent intent = getIntent();
        username = intent.getStringExtra("username");
        fullName = intent.getStringExtra("fullName");
        email = intent.getStringExtra("email");
        password = intent.getStringExtra("password");
        phoneNumber = intent.getStringExtra("phoneNumber");

        bottomNav = findViewById(R.id.bottom_nav);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new TicketFragment()).commit();

        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                switch(item.getItemId()){
                    case R.id.nav_ticket:
                        selectedFragment = new TicketFragment();
                        break;

                    case R.id.nav_route:
                        selectedFragment = new RouteFragment();
                        break;

                    case R.id.nav_profile:
                        selectedFragment = new ProfileFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

                return true;
            }
        });
    }

    public Bundle getProfileData() {
        Bundle profileData = new Bundle();
        profileData.putString("username", username);
        profileData.putString("fullName", fullName != null? fullName : "Name Example");
        profileData.putString("email", email != null? email : "example@gmail.com");
        profileData.putString("password", "********");
        profileData.putString("phoneNumber", phoneNumber != null? phoneNumber : "0855303022");
        return profileData;
    }
}