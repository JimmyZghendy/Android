package com.example.info438tp4ex2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {

    TextView tvFinal;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3, container, false);

        tvFinal = view.findViewById(R.id.tvFinal);

        if (getArguments() != null) {
            String winner = getArguments().getString("winner");
            String date = getArguments().getString("date");

            tvFinal.setText(winner + " plays the final game on " + date);
        }

        return view; 
    }
}
