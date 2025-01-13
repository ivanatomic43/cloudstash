package com.example.cloudstash.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.cloudstash.R;
import com.example.cloudstash.helpers.Validation;

public class SignInActivity extends AppCompatActivity {

    private EditText emailLogin, passwordLogin;
    private ProgressBar progressBar;
//    private AuthServiceAPI authService;
//    RetrofitClientInstance retrofit;
    private SharedPreferences preferences;
//    private DatabaseManagerUser dbManagerUser;
//    private DatabaseManagerMessage dbManagerMessage;

    private Integer userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
//
//        dbManagerUser = new DatabaseManagerUser(this);
//        dbManagerUser.open();

        emailLogin = (EditText) findViewById(R.id.email);
        passwordLogin = (EditText) findViewById(R.id.password);

        final Button login_btn = (Button) findViewById(R.id.btn_login);
        login_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                loginUser();
            }
        });
    }

    private void loginUser() {
        String email = emailLogin.getText().toString();
        String password = passwordLogin.getText().toString();

        Validation.addValidationWatcher(emailLogin, R.drawable.text_input_border_state_error, R.drawable.text_input_border_state_normal);
        Validation.addValidationWatcher(passwordLogin, R.drawable.text_input_border_state_error, R.drawable.text_input_border_state_normal);

        if (true){
            //do the login
            Toast.makeText(SignInActivity.this, "Log in successfully!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SignInActivity.this, HomepageActivity.class);
            startActivity(intent);
        } else {
            //throw error
        }
    }

}