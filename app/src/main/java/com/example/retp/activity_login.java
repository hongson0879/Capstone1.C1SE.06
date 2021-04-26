package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_login extends AppCompatActivity {
    EditText edt_email, edt_password;
    Button btn_login;
    TextView txt_btn_registration,txt_btn_forgot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edt_email=findViewById(R.id.edt_email);
        edt_password=findViewById(R.id.edt_password);
        btn_login=findViewById(R.id.btn_login);
        txt_btn_forgot=findViewById(R.id.txt_btn_forgot);
        txt_btn_registration=findViewById(R.id.txt_btn_registration);
        txt_btn_registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(activity_login.this,activity_registration.class);
                startActivity(intent1);
            }
        });
    }
}