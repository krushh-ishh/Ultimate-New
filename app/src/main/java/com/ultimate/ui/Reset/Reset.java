package com.ultimate.ui.Reset;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ultimate.R;
import com.ultimate.ui.Dashboard.Dashboard;
import com.ultimate.ui.Login.Login;

public class Reset extends AppCompatActivity {

    private EditText reset_email, confirm_password;
    private TextView reset_login;
    private Button btn_reset_continue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);

        findIds();



        btn_reset_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(reset_email.toString().isEmpty() || confirm_password.toString().isEmpty()){
                    Toast.makeText( Reset.this,
                            "Please fill all details",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(Reset.this, Dashboard.class);
                    startActivity(intent);
                }
            }
        });

    }

    private void findIds() {
        reset_email = findViewById(R.id.reset_email);
        confirm_password = findViewById(R.id.confirm_password);
        reset_login = findViewById(R.id.reset_login);
        btn_reset_continue = findViewById(R.id.btn_reset_continue);
    }
}