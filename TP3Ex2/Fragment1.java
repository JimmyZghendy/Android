package com.example.info438tp3ex2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    private EditText editTextName;
    private Button buttonShow;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        editTextName = view.findViewById(R.id.etName);
        buttonShow = view.findViewById(R.id.btnShow);

        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();

                // Send the data to the Activity
                ((MainActivity) getActivity()).updateName(name);
            }
        });

        return view;
    }
}