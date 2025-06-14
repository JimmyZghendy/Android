package com.example.info438tp4ex1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    EditText fname, lname;
    Button btnNext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        fname = view.findViewById(R.id.fname);
        lname = view.findViewById(R.id.lname);
        btnNext = view.findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = fname.getText().toString();
                String lastName = lname.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("fname", firstName);
                bundle.putString("lname", lastName);

                Fragment2 fragment2 = new Fragment2();
                fragment2.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame2, fragment2)
                        .commit();
            }
        });

        return view;
    }
}
