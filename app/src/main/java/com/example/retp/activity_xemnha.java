package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class activity_xemnha extends AppCompatActivity {
    ImageButton img_btn_quaylui;
    Button btn_chat,btn_report;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xemnha);
        img_btn_quaylui=findViewById(R.id.img_btn_quaylai);
        btn_chat=findViewById(R.id.btn_chat);
        btn_report=findViewById(R.id.btn_report);
        img_btn_quaylui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(activity_xemnha.this,MainActivity.class);
                startActivity(intent1);
            }
        });
        btn_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(activity_xemnha.this,chat_activity.class);
                startActivity(intent1);
            }
        });
        btn_report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(activity_xemnha.this,report_activity.class);
                startActivity(intent1);
            }
        });
    }
}