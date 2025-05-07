package com.example.info438v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HeightActivity extends AppCompatActivity {
    EditText editTextHeight;
    Button btnShowBMI;
    String name;
    double weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height);

        TextView textViewHello = findViewById(R.id.tVHello);
        TextView textViewWeight = findViewById(R.id.tVW);
        editTextHeight = findViewById(R.id.eTH);
        btnShowBMI = findViewById(R.id.btnShowBMI);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        weight = intent.getDoubleExtra("weight", 0.0);

        textViewHello.setText("Hello " + name);
        textViewWeight.setText("Your weight is: " + weight + " Kg");

        btnShowBMI.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                double height = Double.parseDouble(editTextHeight.getText().toString());
                double bmi = weight / (height * height);

                Intent intent = new Intent(HeightActivity.this, MainActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("bmi", bmi);
                startActivity(intent);
            }
        });
    }
}