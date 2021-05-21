package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class update_activity extends AppCompatActivity {
    ImageButton img_btn_quaylai3,img_back2,img_btn_camera,img_next2;
    TextView txt_housetype;
    RadioButton group,rad_villa1,rad_groundfloor1,rad_building1,rad_townhouse1,rad_houseinalley1,group1,rad_sale,rad_sold;
    EditText edt_city1,edt_district,edt_road1,edt_price1,edt_description1;
    Button btn_updatepost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_activity);
        img_btn_quaylai3=findViewById(R.id.img_btn_quaylai3);
        img_back2=findViewById(R.id.img_back2);
        img_btn_camera=findViewById(R.id.img_btn_camera);
        img_next2=findViewById(R.id.img_next2);
        txt_housetype=findViewById(R.id.txt_housetype);
        rad_villa1=findViewById(R.id.rad_villa1);
        rad_groundfloor1=findViewById(R.id.rad_groundfloor1);
        rad_building1=findViewById(R.id.rad_building1);
        rad_townhouse1=findViewById(R.id.rad_townhouse1);
        rad_houseinalley1=findViewById(R.id.rad_houseinalley1);
        edt_city1=findViewById(R.id.edt_city1);
        edt_district=findViewById(R.id.edt_district);
        edt_road1=findViewById(R.id.edt_road1);
        edt_price1=findViewById(R.id.edt_price1);
        rad_sale=findViewById(R.id.rad_sale);
        rad_sold=findViewById(R.id.rad_sold);
        edt_description1=findViewById(R.id.edt_description1);
        btn_updatepost=findViewById(R.id.btn_updatepost);
        img_btn_quaylai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(update_activity.this,postactivity.class);
                startActivity(intent1);
            }
        });
    }
}