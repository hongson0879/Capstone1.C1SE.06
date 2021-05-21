package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;

public class activity_sellhouse extends AppCompatActivity {
    ImageButton img_quaylui,img_back1,img_next1,img_btn_camera;
    EditText edt_tittle;
    RadioButton group,rad_villa,rad_groundfloor,rad_building,rad_townhouse,rad_houseinalley;
    EditText edt_city,edt_country,edt_road,edt_price,edt_description;
    Button btn_post;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sellhouse);
        img_quaylui=findViewById(R.id.img_quaylui);
        edt_tittle=findViewById(R.id.edt_tittle);
        img_back1=findViewById(R.id.img_back2);
        img_next1=findViewById(R.id.img_next2);
        img_btn_camera=findViewById(R.id.img_btn_camera);
        rad_villa=findViewById(R.id.rad_villa1);
        rad_groundfloor=findViewById(R.id.rad_groundfloor1);
        rad_building=findViewById(R.id.rad_building1);
        rad_townhouse=findViewById(R.id.rad_townhouse1);
        rad_houseinalley=findViewById(R.id.rad_houseinalley1);
        edt_city=findViewById(R.id.edt_city1);
        edt_country=findViewById(R.id.edt_country);
        edt_road=findViewById(R.id.edt_road1);
        edt_price=findViewById(R.id.edt_price1);
        edt_description=findViewById(R.id.edt_description1);
        btn_post=findViewById(R.id.btn_post);
        img_quaylui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(activity_sellhouse.this,MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}