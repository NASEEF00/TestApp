package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Registerpage extends AppCompatActivity {

    Button Register;
    EditText usn,pas;
    RadioGroup radio;
    RadioButton rb1,rb2;
    String Username,Password;
    CheckBox c1,c2,c3;
    String states [] = {"SELECT STATE", "Kerala", "TamilNadu", "Karnataka", "Goa","Andrapradesh"};
    Spinner sp;
    ArrayAdapter arrayadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerpage);
        usn = (EditText) findViewById(R.id.et8);
        pas = (EditText) findViewById(R.id.et9);
        c1 = (CheckBox) findViewById(R.id.checkBox2);
        c2 = (CheckBox) findViewById(R.id.checkBox3);
        c3 = (CheckBox) findViewById(R.id.checkBox4);
        sp =(Spinner) findViewById(R.id.spinner);
        arrayadapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_expandable_list_item_1,states);
        sp.setAdapter(arrayadapter);
        // spinner click
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(adapterView.getItemAtPosition(i).equals("SELECT STATE")) {}
                else {
                Toast.makeText(getApplicationContext(),states[i],Toast.LENGTH_LONG).show();
            }}

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

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
                finish();
                Toast.makeText(Registerpage.this, "Registration Success", Toast.LENGTH_SHORT).show();

                String langg = "Selected languages are";
                if (c1.isChecked()){
                    langg+="English";
                }
                if (c2.isChecked()){
                    langg+="Malayalam";
                }
                if (c3.isChecked()){
                    langg+="Hindi";
                }
                Toast.makeText(getApplicationContext(), " "+langg, Toast.LENGTH_LONG).show();

            }
        } );


        radio = (RadioGroup) findViewById(R.id.rg000);
        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb1.getText().toString();
                Toast.makeText(getApplicationContext(), "Gender is male", Toast.LENGTH_SHORT).show();

            }
        });

        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb2.getText().toString();
                Toast.makeText(getApplicationContext(), "Gender is female", Toast.LENGTH_SHORT).show();

            }
        });

    }

    public void register(View view) {
        boolean checkedchekbox = ((CheckBox)view).isChecked();
        String lang ="";
        switch (view.getId()){
            case R.id.checkBox2:
                lang = checkedchekbox ? "English selected " : "English deselected";
                break;
            case R.id.checkBox3:
                lang = checkedchekbox ? "Malayalam selected " : "Malayalam deselected";
                break;
            case R.id.checkBox4:
                lang = checkedchekbox ? "Hindi selected " : "Hindi deselected";
                break;
        }
        Toast.makeText(getApplicationContext(), "Languages known are "+lang, Toast.LENGTH_SHORT).show();
    }
}