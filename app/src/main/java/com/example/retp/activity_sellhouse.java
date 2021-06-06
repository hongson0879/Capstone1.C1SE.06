package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.retp.Models.ProductRequest;
import com.example.retp.Models.loginRequest;
import com.example.retp.Remote.IMyAPI;
import com.example.retp.Remote.RetrofitClient;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class activity_sellhouse extends AppCompatActivity {
    IMyAPI iMyAPI;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    ImageButton img_quaylui,img_back1,img_next1,img_btn_camera;
    EditText edt_tittle;
    RadioButton group,rad_villa,rad_groundfloor,rad_building,rad_townhouse,rad_houseinalley;
    EditText edt_title,edt_country,edt_road,edt_price,edt_description,edt_address,edt_longitude,edt_latitude;
    Button btn_post;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sellhouse);
        iMyAPI = RetrofitClient.getInstance().create(IMyAPI.class);
        img_quaylui=findViewById(R.id.img_quaylui);

        img_back1=findViewById(R.id.img_back2);
        img_next1=findViewById(R.id.img_next2);
        img_btn_camera=findViewById(R.id.img_btn_camera);
        rad_villa=findViewById(R.id.rad_villa1);
        rad_groundfloor=findViewById(R.id.rad_groundfloor1);
        rad_building=findViewById(R.id.rad_building1);
        rad_townhouse=findViewById(R.id.rad_townhouse1);
        rad_houseinalley=findViewById(R.id.rad_houseinalley1);
        edt_title=findViewById(R.id.edt_title);
        edt_address=findViewById(R.id.edt_address);
        edt_road=findViewById(R.id.edt_road1);
        edt_longitude=findViewById(R.id.edt_longitude);
        edt_latitude=findViewById(R.id.edt_latitude);
        edt_description=findViewById(R.id.edt_description);
        btn_post=findViewById(R.id.btn_post);
        img_quaylui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(activity_sellhouse.this,MainActivity.class);
                startActivity(intent1);
            }
        });
        btn_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(activity_sellhouse.this);
                dialog.show();
                ProductRequest product = new ProductRequest(edt_title.getText().toString(),edt_description.getText().toString(),edt_address.getText().toString());
                compositeDisposable.add(iMyAPI.ProductUpdate(product)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Consumer<String>() {
                            @Override
                            public void accept(String s) throws Exception {
                                Toast.makeText(activity_sellhouse.this, s, Toast.LENGTH_SHORT).show();
                            }
                        }, new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable throwable) throws Exception {
                                dialog.dismiss();
                                Toast.makeText(activity_sellhouse.this, throwable.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        })
                );

            }
        });
    }
    @Override
    protected void onStop() {
        compositeDisposable.clear();
        super.onStop();
    }
}