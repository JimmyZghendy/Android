package com.example.info438tp2ex2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class Fragment1 extends Fragment {
    private   String[] names= {"Fadi", "Pierre", "Roza", "Mira", "Jean"};
    private   String[] profiles= {"Admin", "User", "Student", "Employee", "Teacher"};
    private ListView lv1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        lv1 = view.findViewById(R.id.l1);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, names);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment2 fragment2 = (Fragment2) getParentFragmentManager().findFragmentById(R.id.f2);
                if(fragment2 != null) {
                    fragment2.change(names[position], profiles[position]);
                }
            }
        });
        return view;
    }
}