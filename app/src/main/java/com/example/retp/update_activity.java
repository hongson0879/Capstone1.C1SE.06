package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class update_activity extends AppCompatActivity {
    ImageButton img_btn_quaylai3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_activity);
        img_btn_quaylai3=findViewById(R.id.img_btn_quaylai3);
        img_btn_quaylai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(update_activity.this,activity_mypost.class);
                startActivity(intent1);
            }
        });
    }
}