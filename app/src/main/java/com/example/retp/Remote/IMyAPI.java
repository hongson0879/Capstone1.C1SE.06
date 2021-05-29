package com.example.retp.Remote;

import com.example.retp.Models.loginRequest;
import com.example.retp.Models.registerRequest;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IMyAPI {
    @POST("/swagger/index.html")
    Observable<String>  registerUser(@Body registerRequest register );
    @POST("/swagger/index.html")
    Observable<String>  loginUser(@Body loginRequest login );

}
