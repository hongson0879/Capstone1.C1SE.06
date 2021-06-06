package com.example.retp.Remote;

import com.example.retp.Models.ProductRequest;
import com.example.retp.Models.loginRequest;
import com.example.retp.Models.registerRequest;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IMyAPI {
    @POST("api/User/register")
    Observable<String>  registerUser(@Body registerRequest register );
    @POST("api/User/authenticate")
    Observable<String>  loginUser(@Body loginRequest login );
    @POST("api/Product")
    Observable<String> ProductUpdate(@Body ProductRequest product);

}
