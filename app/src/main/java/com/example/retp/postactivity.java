package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class postactivity extends AppCompatActivity {
    ImageButton img_btn_quaylai2,img_back,img_page1_1,img_next;
    ImageView img_home4;
    TextView txt_title2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postactivity);
        img_btn_quaylai2=findViewById(R.id.img_btn_quaylai2);
        img_home4=findViewById(R.id.img_home4);
        img_back=findViewById(R.id.img_back);
        img_page1_1=findViewById(R.id.img_page1_1);
        img_next=findViewById(R.id.img_next);
        txt_title2=findViewById(R.id.txt_title2);
        img_btn_quaylai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(postactivity.this,activity_menu.class);
                startActivity(intent1);
            }
        });
        txt_title2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(postactivity.this,update_activity.class);
                startActivity(intent1);
            }
        });
    }
}