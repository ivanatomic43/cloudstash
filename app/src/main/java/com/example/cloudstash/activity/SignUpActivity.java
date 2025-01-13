package com.example.cloudstash.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cloudstash.R;
import com.example.cloudstash.helpers.Validation;

public class SignUpActivity extends AppCompatActivity {

    private EditText firstName, lastName, emailAddress, phoneNumber, userPassword, userRepeatedPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        firstName = (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);
        emailAddress = (EditText) findViewById(R.id.email);
        phoneNumber = (EditText) findViewById(R.id.phone_number);
        userPassword = (EditText) findViewById(R.id.password);
        userRepeatedPassword = (EditText) findViewById(R.id.repeatPassword);

        Button signUp = (Button) findViewById(R.id.btn_sign_up);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });
     
    }

    private void registerUser(){
        final String firstname = firstName.getText().toString();
        final String lastname = lastName.getText().toString();
        final String email = emailAddress.getText().toString();
        final String phonenumber = phoneNumber.getText().toString();
        final String password = userPassword.getText().toString();
        final String repeatedPassword = userRepeatedPassword.getText().toString();

        boolean isValid = true;


        Validation.addValidationWatcher(firstName, R.drawable.text_input_border_state_error, R.drawable.text_input_border_state_normal);
        Validation.addValidationWatcher(lastName, R.drawable.text_input_border_state_error, R.drawable.text_input_border_state_normal);
        Validation.addValidationWatcher(emailAddress, R.drawable.text_input_border_state_error, R.drawable.text_input_border_state_normal);
        Validation.addValidationWatcher(phoneNumber, R.drawable.text_input_border_state_error, R.drawable.text_input_border_state_normal);
        Validation.addValidationWatcher(userPassword, R.drawable.text_input_border_state_error, R.drawable.text_input_border_state_normal);
        Validation.addValidationWatcher(userRepeatedPassword, R.drawable.text_input_border_state_error, R.drawable.text_input_border_state_normal);


        if(isValid){
            // register user
            Toast.makeText(SignUpActivity.this, "Registration successfully!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
            startActivity(intent);
        } else {
            // throw registration error
        }

    }
}
