package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.retp.Models.loginRequest;
import com.example.retp.Remote.IMyAPI;
import com.example.retp.Remote.RetrofitClient;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class activity_login extends AppCompatActivity {
    IMyAPI iMyAPI;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    EditText edt_username, edt_password;
    Button btn_LOGIN;
    TextView txt_btn_registration,txt_btn_forgot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        iMyAPI = RetrofitClient.getInstance().create(IMyAPI.class);

        edt_username=findViewById(R.id.edt_username);
        edt_password=findViewById(R.id.edt_password);
        btn_LOGIN=findViewById(R.id.btn_LOGIN);
        txt_btn_forgot=findViewById(R.id.txt_btn_forgot);
        txt_btn_registration=findViewById(R.id.txt_btn_registration);
        btn_LOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(activity_login.this);
                dialog.show();
                loginRequest login = new loginRequest(edt_username.getText().toString(),edt_password.getText().toString());
                compositeDisposable.add(iMyAPI.loginUser(login)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Consumer<String>() {
                            @Override
                            public void accept(String s) throws Exception {
                                if (s.equals("Đăng Nhập Thành Công")) {

                                    finish();
                                }
                                Toast.makeText(activity_login.this, s, Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(activity_login.this,home.class);
                                startActivity(intent);
                            }


                        }, new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable throwable) throws Exception {
                                dialog.dismiss();
                                Toast.makeText(activity_login.this, throwable.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        })
                );

            }
        });
        txt_btn_registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =   new Intent(activity_login.this,activity_registration.class);
                startActivity(intent1);
            }
        });
    }
    @Override
    protected void onStop() {
        compositeDisposable.clear();
        super.onStop();
    }
}