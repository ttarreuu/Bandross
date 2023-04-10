package com.example.bandross;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class ProfileFragment extends Fragment {

    private TextView tv_fullname, tv_username, tv_email, tv_password, tv_phone;


    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        tv_fullname = view.findViewById(R.id.inputbox_fullname);
        tv_username = view.findViewById(R.id.inputbox_username);
        tv_email = view.findViewById(R.id.inputbox_email);
        tv_password = view.findViewById(R.id.inputbox_password);
        tv_phone = view.findViewById(R.id.inputbox_phone);

        NavigationActivity activity = (NavigationActivity) getActivity();
        Bundle bundle = activity.getProfileData();
        if(bundle != null){
            String fullname = bundle.getString("fullName");
            String username = bundle.getString("username");
            String email = bundle.getString("email");
            String password = bundle.getString("password");
            String phone = bundle.getString("phoneNumber");

            tv_fullname.setText(fullname);
            tv_username.setText(username);
            tv_email.setText(email);
            tv_password.setText(password);
            tv_phone.setText(phone);
        }
        return view;
    }
}