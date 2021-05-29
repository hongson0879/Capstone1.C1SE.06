package com.example.retp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.retp.Models.registerRequest;
import com.example.retp.Remote.IMyAPI;
import com.example.retp.Remote.RetrofitClient;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class activity_registration extends AppCompatActivity {
    EditText edt_firstname,edt_lastname,edt_password,edt_password1,edt_email,edt_phone,edt_username;
    Button btn_registration;
    IMyAPI iMyAPI;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        iMyAPI = RetrofitClient.getInstance().create(IMyAPI.class);
        edt_username = findViewById(R.id.edt_username);
        edt_firstname = findViewById(R.id.edt_firstname);
        edt_lastname = findViewById(R.id.edt_lastname);
        edt_password = findViewById(R.id.edt_password);
        edt_password1 = findViewById(R.id.edt_password1);
        edt_email = findViewById(R.id.edt_email);
        edt_phone = findViewById(R.id.edt_phone);
        btn_registration = findViewById(R.id.btn_registration);
        btn_registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(activity_registration.this);
                dialog.show();
                registerRequest register = new registerRequest(edt_username.getText().toString(), edt_password.getText().toString(),
                        edt_password1.getText().toString(), edt_firstname.getText().toString(), edt_lastname.getText().toString()
                        , edt_phone.getText().toString(), edt_email.getText().toString());
                compositeDisposable.add(iMyAPI.registerUser(register)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Consumer<String>() {
                            @Override
                            public void accept(String s) throws Exception {
                                if (s.equals("Register successful")) {

                                    finish();
                                }
                                Toast.makeText(activity_registration.this, s, Toast.LENGTH_SHORT).show();
                                dialog.dismiss();

                            }
                        }, new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable throwable) throws Exception {
                                dialog.dismiss();
                                Toast.makeText(activity_registration.this, throwable.getMessage(), Toast.LENGTH_SHORT).show();
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
