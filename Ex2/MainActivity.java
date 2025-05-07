package com.example.info438v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    Button btnAddWeight;
    TextView textViewBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.eTName);
        btnAddWeight = findViewById(R.id.btnAddW);
        textViewBMI = findViewById(R.id.tVBMI);

        btnAddWeight.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String name = editTextName.getText().toString();
                Intent intent = new Intent(MainActivity.this, WeightActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        if (intent.hasExtra("bmi")) {
            String name = intent.getStringExtra("name");
            double bmi = intent.getDoubleExtra("bmi", 0.0);
            textViewBMI.setText("Hello " + name + ", your BMI is: " + String.format("%.2f", bmi));
        }
    }
}
