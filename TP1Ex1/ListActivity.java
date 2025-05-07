package com.example.info438;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {
private static final String[] frenchItems = {"Voiture", "Maison", "Ecole", "Banque" };
private static final String[] englishItems = {"Car", "House", "School", "Bank" };
private static  String[] result = {};
String language;
ListView lv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Bundle res = this.getIntent().getExtras();
        if(res != null) {
            language = res.getString("key");
            if(language.equals("f")){
                result = frenchItems;
            } else if (language.equals("e")) {
                result = englishItems;
            }
           lv1 = (ListView) findViewById(R.id.listview1);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, result);
            lv1.setAdapter(adapter);
        }
    }
}