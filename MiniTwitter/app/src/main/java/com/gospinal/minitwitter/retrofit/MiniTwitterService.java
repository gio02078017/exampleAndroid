package com.gospinal.minitwitter.retrofit;

import com.gospinal.minitwitter.retrofit.request.RequestLogin;
import com.gospinal.minitwitter.retrofit.request.RequestSignup;
import com.gospinal.minitwitter.retrofit.response.ResponseAuth;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface MiniTwitterService {

    @POST("auth/login")
    Call<ResponseAuth> doLogin(@Body RequestLogin requestLogin);

    @POST("auth/signup")
    Call<ResponseAuth> doSignUp(@Body RequestSignup requestSignup);

}
