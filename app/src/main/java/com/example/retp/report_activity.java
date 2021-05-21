package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class report_activity extends AppCompatActivity {
    ImageButton img_btn_quaylai4,img_back3,img_btn_imgreport,img_btn_imgreport1,img_btn_imgreport2,img_next3;
    TextView txt_seller1;
    EditText edt_reason;
    Button btn_report1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_activity);
        img_btn_quaylai4=findViewById(R.id.img_btn_quaylai4);
        txt_seller1=findViewById(R.id.txt_seller1);
        img_back3=findViewById(R.id.img_back3);
        img_btn_imgreport=findViewById(R.id.img_btn_imgreport);
        img_btn_imgreport1=findViewById(R.id.img_btn_imgreport1);
        img_btn_imgreport2=findViewById(R.id.img_btn_imgreport2);
        img_next3=findViewById(R.id.img_next3);
        edt_reason=findViewById(R.id.edt_reason);
        btn_report1=findViewById(R.id.btn_report1);
        img_btn_quaylai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(report_activity.this,activity_xemnha.class);
                startActivity(intent1);
            }
        });
    }
}