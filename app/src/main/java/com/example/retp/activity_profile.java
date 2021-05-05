package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class activity_profile extends AppCompatActivity {
    ImageButton img_btn_quaylui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        img_btn_quaylui=findViewById(R.id.img_btn_quaylai);
        img_btn_quaylui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(activity_profile.this,MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}