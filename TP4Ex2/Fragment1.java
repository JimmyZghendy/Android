package com.example.info438tp4ex2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    EditText etP1Name, etP2Name, p1Set1, p1Set2, p2Set1, p2Set2;
    Button btnResult;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        etP1Name = view.findViewById(R.id.etP1Name);
        etP2Name = view.findViewById(R.id.etP2Name);
        p1Set1 = view.findViewById(R.id.p1Set1);
        p1Set2 = view.findViewById(R.id.p1Set2);
        p2Set1 = view.findViewById(R.id.p2Set1);
        p2Set2 = view.findViewById(R.id.p2Set2);
        btnResult = view.findViewById(R.id.btnResult);

        btnResult.setOnClickListener(v -> {
            int p1Wins = 0, p2Wins = 0;

            String nameP1 = etP1Name.getText().toString();
            String nameP2 = etP2Name.getText().toString();

            int p1s1 = Integer.parseInt(p1Set1.getText().toString());
            int p1s2 = Integer.parseInt(p1Set2.getText().toString());
            int p2s1 = Integer.parseInt(p2Set1.getText().toString());
            int p2s2 = Integer.parseInt(p2Set2.getText().toString());

            if (p1s1 > p2s1) p1Wins++;
            else p2Wins++;

            if (p1s2 > p2s2) p1Wins++;
            else p2Wins++;

            if (p1Wins == 1 && p2Wins == 1) {
                Toast.makeText(getActivity(), "Only one Player must win", Toast.LENGTH_SHORT).show();
            } else {
                String winner = (p1Wins == 2) ? nameP1 : nameP2;

                Bundle bundle = new Bundle();
                bundle.putString("winner", winner);

                Fragment2 fragment2 = new Fragment2();
                fragment2.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.mainFrame, fragment2)
                        .commit();
            }
        });

        return view;
    }
}