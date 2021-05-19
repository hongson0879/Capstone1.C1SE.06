
package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class activity_menu extends AppCompatActivity {
    ImageButton img_btn_quaylui;
    Button btn_profile,btn_sellhouse,btn_logout,btn_myposts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        img_btn_quaylui=findViewById(R.id.img_btn_quaylui);
        btn_profile=findViewById(R.id.btn_Profile);
        btn_sellhouse=findViewById(R.id.btn_sellhouse);
        btn_logout=findViewById(R.id.btn_logout);
        btn_myposts=findViewById(R.id.btn_post);
        img_btn_quaylui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(activity_menu.this,MainActivity.class);
                startActivity(intent1);
            }
        });
        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(activity_menu.this,activity_profile.class);
                startActivity(intent1);
            }
        });
        btn_sellhouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(activity_menu.this,activity_sellhouse.class);
                startActivity(intent1);
            }
        });
        btn_myposts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(activity_menu.this,activity_mypost.class);
                startActivity(intent1);
            }
        });

    }
}