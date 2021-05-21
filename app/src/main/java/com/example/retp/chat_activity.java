package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

public class chat_activity extends AppCompatActivity {
    ImageButton img_btn_quaylai3;
    ListView List_sms;
    EditText edt_input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_activity);
        img_btn_quaylai3=findViewById(R.id.img_btn_quaylai3);
        List_sms=findViewById(R.id.List_sms);
        edt_input=findViewById(R.id.edt_input);
        img_btn_quaylai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(chat_activity.this,activity_xemnha.class);
                startActivity(intent1);
            }
        });
    }
}