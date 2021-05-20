package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class report_activity extends AppCompatActivity {
    ImageButton img_btn_quaylai4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_activity);
        img_btn_quaylai4=findViewById(R.id.img_btn_quaylai4);
        img_btn_quaylai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(report_activity.this,activity_xemnha.class);
                startActivity(intent1);
            }
        });
    }
}