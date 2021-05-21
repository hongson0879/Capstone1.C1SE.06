package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_xemnha extends AppCompatActivity {
    ImageButton img_btn_quaylui,img_sangtrai1,img_sangphai1,img_btn_map1;
    ImageView img_home3;
    TextView txt_address1,txt_acreage,txt_seller,txt_status,txt_price,txt_decription;
    Button btn_chat,btn_report;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xemnha);
        img_btn_quaylui=findViewById(R.id.img_btn_quaylai);
        btn_chat=findViewById(R.id.btn_chat);
        btn_report=findViewById(R.id.btn_report);
        img_sangtrai1=findViewById(R.id.img_sangtrai1);
        img_sangphai1=findViewById(R.id.img_sangphai1);
        img_home3=findViewById(R.id.img_home3);
        txt_address1=findViewById(R.id.txt_address1);
        img_btn_map1=findViewById(R.id.img_btn_map1);
        txt_acreage=findViewById(R.id.txt_acreage);
        txt_seller=findViewById(R.id.txt_seller1);
        txt_status=findViewById(R.id.txt_status);
        txt_price=findViewById(R.id.txt_price);
        txt_decription=findViewById(R.id.txt_decription);
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
        img_btn_map1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(activity_xemnha.this,MapsActivity.class);
                startActivity(intent1);
            }
        });
    }
}