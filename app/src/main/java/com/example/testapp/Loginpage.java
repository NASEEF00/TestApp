package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Loginpage extends AppCompatActivity {
    Button Login;
    TextView Link;
    EditText un,pw;
    String Username = "admin";
    String Password = "admin";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        un = (EditText) findViewById(R.id.uname);
        pw = (EditText) findViewById(R.id.pword);
        Login = (Button) findViewById(R.id.loginbtn);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = un.getText().toString();
                String password = pw.getText().toString();
                if (Username.equals(username) && Password.equals(password)){
                Intent i = new Intent(getApplicationContext(),Homepage.class);
                startActivity(i);
                    Toast.makeText(getApplicationContext(),"Login success",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Invalid username or password",Toast.LENGTH_LONG).show();
                }

            }
        });
        Link = (TextView) findViewById(R.id.textView3);
        Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Registerpage.class);
                startActivity(intent);

            }
        });


    }
}