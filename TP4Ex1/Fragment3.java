package com.example.info438tp4ex1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {

    TextView tv3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3, container, false);

        tv3 = view.findViewById(R.id.tv3);

        if (getArguments() != null) {
            String level = getArguments().getString("level");
            boolean showLevel = getArguments().getBoolean("showLevel");

            if (showLevel) {
                tv3.setText("Your level is: " + level);
            } else {
                tv3.setText("We can't show your level");
            }
        }

        return view;
    }
}
