package com.ultimate.ui.Signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ultimate.R;
import com.ultimate.ui.Login.Login;

public class Signup extends AppCompatActivity {

    TextView sign_login;
    Button btn_create_account;
    EditText dign_pass, sign_mobile, sign_email, sign_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().hide();

        findIds();

        btn_create_account.setOnClickListener(v -> {
            if(dign_pass.getText().toString().isEmpty() && sign_mobile.getText().toString().isEmpty()
                    && sign_email.getText().toString().isEmpty() && sign_name.getText().toString().isEmpty()){
                Toast.makeText(this, "Please enter all fields", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "Account Created", Toast.LENGTH_SHORT).show();
            }
        });

        sign_login.setOnClickListener(v -> {
            startActivity(new Intent(Signup.this, Login.class));
        });

    }

    private void findIds() {
        sign_login = findViewById(R.id.sign_login);
        btn_create_account = findViewById(R.id.btn_create_account);
        sign_mobile = findViewById(R.id.sign_mobile);
        dign_pass = findViewById(R.id.dign_pass);
        sign_email = findViewById(R.id.sign_email);
        sign_name = findViewById(R.id.sign_name);
    }
}