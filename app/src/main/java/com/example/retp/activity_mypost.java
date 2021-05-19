package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class activity_mypost extends AppCompatActivity {
    ImageButton img_btn_quaylai2;
    TextView txt_title2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypost);
        img_btn_quaylai2=findViewById(R.id.img_btn_quaylai2);
        txt_title2=findViewById(R.id.txt_title2);
        img_btn_quaylai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(activity_mypost.this,activity_menu.class);
                startActivity(intent1);
            }
        });
        txt_title2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(activity_mypost.this,update_activity.class);
                startActivity(intent1);
            }
        });
    }
}