package com.example.info438;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    String Lang ;
    RadioButton buttonFr, buttonEn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonFr = (RadioButton) findViewById(R.id.fr);
        buttonEn = (RadioButton) findViewById(R.id.en);
    }

    public void goToListActivity(View v){
        if(buttonFr.isChecked()){
            Lang = "f";
        } else if (buttonEn.isChecked()) {
            Lang = "e";
        }
        Intent intent = new Intent (MainActivity.this, ListActivity.class);
        intent.putExtra("key", Lang);
        startActivity(intent);
        }

    }