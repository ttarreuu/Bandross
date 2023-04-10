package com.example.bandross;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class TicketFragment extends Fragment {

    private EditText et_name, et_date, et_time, et_passenger;
    private Spinner et_type;
    private Button btn_ticket;

    public TicketFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ticket, container, false);

        et_type = (Spinner) view.findViewById(R.id.inputbox_type);
        et_name = (EditText) view.findViewById(R.id.inputbox_name);
        et_date = (EditText) view.findViewById(R.id.inputbox_date);
        et_time = (EditText) view.findViewById(R.id.inputbox_time);
        et_passenger = (EditText) view.findViewById(R.id.inputbox_passenger);
        btn_ticket = (Button) view.findViewById(R.id.btn_book);

        btn_ticket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et_name.getText().toString();
                String type = et_type.getSelectedItem().toString();
                String date = et_date.getText().toString();
                String time = et_time.getText().toString();
                String passenger = et_passenger.getText().toString();

                Intent intent = new Intent(getActivity(), FinalTicketActivity.class);
                // Pass data
                intent.putExtra("name", name);
                intent.putExtra("type", type);
                intent.putExtra("date", date);
                intent.putExtra("time", time);
                intent.putExtra("passenger", passenger);
                startActivity(intent);
            }
        });

        return view;
    }
}