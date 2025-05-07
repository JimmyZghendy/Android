package com.example.info438v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WeightActivity extends AppCompatActivity {
    EditText editTextWeight;
    Button btnAddHeight;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        TextView textViewHello = findViewById(R.id.tVHello);
        editTextWeight = findViewById(R.id.eTW);
        btnAddHeight = findViewById(R.id.btnAddH);

        name = getIntent().getStringExtra("name");
        textViewHello.setText("Hello " + name);

        btnAddHeight.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                double weight = Double.parseDouble(editTextWeight.getText().toString());
                Intent intent = new Intent(WeightActivity.this, HeightActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("weight", weight);
                startActivity(intent);
            }
        });
    }
}