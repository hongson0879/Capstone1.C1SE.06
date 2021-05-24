package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class subchat_activity2 extends AppCompatActivity {
    TextView message_user,message_time,message_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subchat_activity2);
        message_user=findViewById(R.id.message_user);
        message_time=findViewById(R.id.message_time);
        message_text=findViewById(R.id.message_text);
    }
}