package com.example.info438tp3ex1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        textView = view.findViewById(R.id.tv1);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String text = bundle.getString("text_key");
            textView.setText(text);
        }

        return view;
    }
}