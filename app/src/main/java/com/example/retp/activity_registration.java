package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class activity_registration extends AppCompatActivity {
    EditText edt_firstname,edt_lastname,edt_password,edt_password1,edt_email,edt_phone;
    Button btn_registration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        edt_firstname=findViewById(R.id.edt_firstname);
        edt_lastname=findViewById(R.id.edt_lastname);
        edt_password=findViewById(R.id.edt_password);
        edt_password1=findViewById(R.id.edt_password1);
        edt_email=findViewById(R.id.edt_email);
        edt_phone=findViewById(R.id.edt_phone);
        btn_registration=findViewById(R.id.btn_registration);
    }
}