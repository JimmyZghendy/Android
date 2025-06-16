package com.example.info438tp4ex2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {

    TextView tvWinner;
    EditText etDate;
    Button btnOk;

    String winnerName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        tvWinner = view.findViewById(R.id.tvWinner);
        etDate = view.findViewById(R.id.etDate);
        btnOk = view.findViewById(R.id.btnOk);

        if (getArguments() != null) {
            winnerName = getArguments().getString("winner");
            tvWinner.setText("The winner is " + winnerName);
        }

        btnOk.setOnClickListener(v -> {
            String date = etDate.getText().toString();

            Bundle bundle = new Bundle();
            bundle.putString("winner", winnerName);
            bundle.putString("date", date);

            Fragment3 fragment3 = new Fragment3();
            fragment3.setArguments(bundle);

            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.mainFrame, fragment3)
                    .commit();
        });

        return view;
    }
}
