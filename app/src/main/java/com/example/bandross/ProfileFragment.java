package com.example.bandross;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
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

        Bundle bundle = getArguments();
        if(bundle != null){
            String fullname = bundle.getString("i_fullname");
            String username = bundle.getString("i_username");
            String email = bundle.getString("i_email");
            String password = bundle.getString("i_password");
            String phone = bundle.getString("i_phone");

            tv_fullname.setText(fullname);
            tv_username.setText(username);
            tv_email.setText(email);
            tv_password.setText(password);
            tv_phone.setText(phone);
        }
        return view;
    }
}