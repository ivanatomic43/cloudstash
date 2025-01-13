package com.example.cloudstash.api;

import com.example.cloudstash.network.RetrofitClientInstance;
import com.example.cloudstash.dto.UserDTO;
import com.example.cloudstash.dto.LoginResponseDTO;
import com.example.cloudstash.dto.LoginRequestDTO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface AuthServiceAPI {

    @Headers({
            "User-Agent: Mobile-Android",
            "Content-Type:application/json"
    })
    @POST(RetrofitClientInstance.AUTH_URL + "/register")
    Call<UserDTO> registerUser(@Body UserDTO user);

    @POST(RetrofitClientInstance.AUTH_URL +"/login")
    Call<LoginResponseDTO> login(@Body LoginRequestDTO request);

    @Headers({
            "User-Agent: Mobile-Android",
            "Content-Type:application/json"
    })
    @GET(RetrofitClientInstance.AUTH_URL +"/getLoggedUser")
    Call<UserDTO> getLoggedUser(String token);
}
