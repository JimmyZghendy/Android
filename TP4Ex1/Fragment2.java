package com.example.info438tp4ex1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {

    TextView flname;
    RadioButton beginner, expert;
    CheckBox cb;
    Button btnNext2;

    String rcvdFName;
    String rcvdLName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        flname = view.findViewById(R.id.flname);
        beginner = view.findViewById(R.id.beginner);
        expert = view.findViewById(R.id.expert);
        cb = view.findViewById(R.id.cb);
        btnNext2 = view.findViewById(R.id.btnNext2);

        // Get name from Fragment1
        if (getArguments() != null) {
            rcvdFName = getArguments().getString("fname");
            rcvdLName = getArguments().getString("lname");
            flname.setText("Hello" + rcvdFName + " " + rcvdLName);
        }

        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String selectedLevel = "";
                if (beginner.isChecked()) {
                    selectedLevel = "Beginner";
                } else if (expert.isChecked()) {
                    selectedLevel = "Expert";
                } else {
                    selectedLevel = "Unknown";
                }

                boolean showLevel = cb.isChecked();

                // Pass data to Fragment3
                Bundle bundle = new Bundle();
                bundle.putString("level", selectedLevel);
                bundle.putBoolean("showLevel", showLevel);

                Fragment3 fragment3 = new Fragment3();
                fragment3.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame3, fragment3)
                        .commit();
            }
        });

        return view;
    }
}
