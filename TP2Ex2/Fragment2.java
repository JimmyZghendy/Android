package com.example.info438tp2ex2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Fragment2 extends Fragment {

    private TextView nameTv, profileTv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_2, container, false);
        nameTv = view.findViewById(R.id.tv1);
        profileTv = view.findViewById(R.id.tv2);
        return view;
    }
    public void change (String name, String profile){
        if(nameTv != null && profileTv != null){
            nameTv.setText("Name: " + name);
            profileTv.setText("Profile: " + profile);
        }
    }
}