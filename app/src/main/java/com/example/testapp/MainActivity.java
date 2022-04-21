package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread obj = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

                Intent i = new Intent(getApplicationContext(),Loginpage.class);
                startActivity(i);
                finish();
            }
        };
        obj.start();

    }
}