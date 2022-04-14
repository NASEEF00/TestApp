package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {

    TextView tv;
    String Username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        tv = findViewById(R.id.textView7);
        Username=getIntent().getExtras().getString("value3");
        tv.setText("Hi "+Username+" Welcome to TestApp");
    }
}