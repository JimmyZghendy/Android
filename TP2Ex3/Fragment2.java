package com.example.fragmenttofragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment2 extends Fragment {
    private TextView textFirstName, textLastName;
    private String firstName, lastName;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firstName = getArguments().getString("firstName", "");
        lastName = getArguments().getString("lastName", "");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        textFirstName = view.findViewById(R.id.fnameTv);
        textLastName = view.findViewById(R.id.lnameTv);

        //Set the received data
        textFirstName.setText("First Name: " + firstName);
        textLastName.setText("Last Name: " + lastName);

        return view;
    }
}