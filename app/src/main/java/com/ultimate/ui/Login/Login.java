package com.ultimate.ui.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ultimate.R;
import com.ultimate.ui.Dashboard.Dashboard;
import com.ultimate.ui.ForgotPassword.ForgotPassword;
import com.ultimate.ui.Home.Home;
import com.ultimate.ui.Signup.Signup;

public class Login extends AppCompatActivity {

    private TextView login_forgtPass, login_loginBtn, login_signup;
    private EditText loginPassword, login_email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        findIds();

        login_forgtPass.setOnClickListener(v -> {
            if(login_email.toString().isEmpty() || loginPassword.toString().isEmpty()){
                Toast.makeText( Login.this,
                        "Please fill all details",
                        Toast.LENGTH_SHORT).show();
            }
            else{
//                    Intent intent = new Intent(Login.this, Dashboard.class);
//                    startActivity(intent);
//                    startActivity(Intent(this, Dashboard::class.java))
//
//                    signin()
            }
        });

        login_loginBtn.setOnClickListener(v -> {

            //validaions
            Intent intent = new Intent(Login.this, Dashboard.class);
            startActivity(intent);
        });

        login_signup.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, Signup.class);
            startActivity(intent);
        });


    }

    private void findIds() {
        login_forgtPass = findViewById(R.id.login_forgtPass);
        login_loginBtn = findViewById(R.id.login_loginBtn);
        login_signup = findViewById(R.id.login_signup);

        loginPassword = findViewById(R.id.loginPassword);
        login_email = findViewById(R.id.login_email);
    }
}