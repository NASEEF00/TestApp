package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Homepage extends AppCompatActivity {

    TextView tv;
    String Username;
    ListView lv;
    String stars[] ={"Sun", "Mercury", "Venus", "Earth", "Mars" , "Jupiter" , "Saturn", "Uranus","Neptune" };
    ArrayAdapter  arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
//        tv = findViewById(R.id.textView7);
//        Username=getIntent().getExtras().getString("value3");
//        tv.setText("Hi "+Username+" Welcome to TestApp");

        lv = (ListView)findViewById(R.id.listview1);
        arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,stars);
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "selected star is "+stars[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}