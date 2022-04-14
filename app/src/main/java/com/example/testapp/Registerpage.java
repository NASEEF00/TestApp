package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registerpage extends AppCompatActivity {

    Button Register;
    EditText usn,pas;
    String Username,Password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerpage);
        usn = (EditText) findViewById(R.id.et8);
        pas = (EditText) findViewById(R.id.et9);

        Register = (Button) findViewById(R.id.reg);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent q = new Intent(getApplicationContext(),Loginpage.class);
                Username=usn.getText().toString();
                q.putExtra("value",Username);
                Password=pas.getText().toString();
                q.putExtra("value1",Password);
                startActivity(q);
                Toast.makeText(Registerpage.this, "Registration Success", Toast.LENGTH_SHORT).show();
            }
        });
    }
}