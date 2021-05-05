package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class activity_sellhouse extends AppCompatActivity {
    ImageButton img_quaylui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sellhouse);
        img_quaylui=findViewById(R.id.img_quaylui);
        img_quaylui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(activity_sellhouse.this,MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}