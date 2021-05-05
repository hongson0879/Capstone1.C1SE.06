    package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_login;
    ImageButton img_btn_menu;
    TextView txt_thongtin,txt_thongtin1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_login=findViewById(R.id.btn_login);
        img_btn_menu=findViewById(R.id.img_btn_menu);
        txt_thongtin=findViewById(R.id.txt_thongtin);
        txt_thongtin1=findViewById(R.id.txt_thongtin1);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(MainActivity.this,activity_login.class);
                startActivity(intent1);
            }
        });
        img_btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 =   new Intent(MainActivity.this,activity_menu.class);
                startActivity(intent2);
            }
        });
        txt_thongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(MainActivity.this,activity_xemnha.class);
                startActivity(intent1);
            }
        });
        txt_thongtin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(MainActivity.this,activity_xemnha.class);
                startActivity(intent1);
            }
        });
    }
}