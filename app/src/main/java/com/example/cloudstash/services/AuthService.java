package com.example.cloudstash.services;


import android.util.Log;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import com.example.cloudstash.activity.SignUpActivity;
import com.example.cloudstash.api.AuthServiceAPI;
import com.example.cloudstash.model.User;
import com.example.cloudstash.network.RetrofitClientInstance;
import com.example.cloudstash.dto.UserDTO;

public class AuthService {
    private AuthServiceAPI authServiceAPI;
    private RetrofitClientInstance retrofit;

    public void registerUser(User user){

        authServiceAPI = retrofit.getRetrofitInstance().create(AuthServiceAPI.class);
        UserDTO userDTO = new UserDTO(user);

        Call<UserDTO> call = authServiceAPI.registerUser(userDTO);
        call.enqueue(new Callback<UserDTO>() {

            @Override
            public void onResponse(Call<UserDTO> call, Response<UserDTO> response) {
                Log.i("Response", response.toString());
                if(response.isSuccessful()){
                    Toast.makeText(SignUpActivity.this, "Succesfully sent to server", Toast.LENGTH_LONG).show();
                    if(response.code()==200){
                        //prebaci na sledecu aktivnost
                    } else if( response.code()==400){
                        Toast.makeText(SignUpActivity.this, "E-mail is already in use", Toast.LENGTH_SHORT).show();
                    }
                    else if (response.code() ==403){
                        //baci gresku, vidi na serveru sta je 403
                    }
                }
            }

            @Override
            public void onFailure(Call<UserDTO> call, Throwable t) {
                t.printStackTrace();
            }
        });
}
