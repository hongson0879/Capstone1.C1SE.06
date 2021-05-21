package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;

public class activity_profile extends AppCompatActivity {
    ImageButton img_btn_quaylui;
    EditText edt_name,edt_email,edt_username,edt_phone,edt_password,edt_address,edt_dateofbirth;
    RadioButton Gruop,Rad_male,rad_female,rad_other;
    Button btn_update;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        edt_name=findViewById(R.id.edt_name);
        edt_email=findViewById(R.id.edt_email);
        edt_username=findViewById(R.id.edt_username);
        edt_phone=findViewById(R.id.edt_phone);
        edt_password=findViewById(R.id.edt_password);
        edt_address=findViewById(R.id.edt_address);
        img_btn_quaylui=findViewById(R.id.img_btn_quaylai);
        edt_dateofbirth=findViewById(R.id.edt_dateofbirth);
        Rad_male=findViewById(R.id.Rad_male);
        rad_female=findViewById(R.id.rad_female);
        rad_other=findViewById(R.id.rad_other);
        btn_update=findViewById(R.id.btn_update);
        img_btn_quaylui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(activity_profile.this,MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}