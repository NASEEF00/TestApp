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
    String Username;
    String Password;
    int count = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        un = (EditText) findViewById(R.id.uname);
        Username = getIntent().getExtras().getString("value");
        un.setText(Username);
        pw = (EditText) findViewById(R.id.pword);
        Password = getIntent().getExtras().getString("value1");
        pw.setText(Password);
        Login = (Button) findViewById(R.id.loginbtn);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = un.getText().toString();
                String password = pw.getText().toString();



                if (Username.equals(username) && Password.equals(password)){
                Intent i = new Intent(getApplicationContext(),Homepage.class);
                Username = un.getText().toString();
                i.putExtra("value3",Username);
                startActivity(i);
                    Toast.makeText(getApplicationContext(),"Login success",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Invalid username or password",Toast.LENGTH_SHORT).show();
                    count--;
                    if (count==0){
                        Login.setEnabled(false);
                    }
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