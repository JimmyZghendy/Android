package com.example.fragmenttofragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Fragment1 extends Fragment {
    private EditText editFirstName, editLastName;
    private Button btnSubmit;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        editFirstName = view.findViewById(R.id.et1);
        editLastName = view.findViewById(R.id.et2);
        btnSubmit = view.findViewById(R.id.btn1);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get the first and last names
                String firstName = editFirstName.getText().toString();
                String lastName = editLastName.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("firstName", firstName);
                bundle.putString("lastName", lastName);
                Fragment2 fragment2 = new Fragment2();
                fragment2.setArguments(bundle);
                FragmentManager fm = getParentFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment_container, fragment2);
                ft.commit();
            }
        });
        return view;

    }
}