package com.ultimate.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.WindowManager;

import com.ultimate.R;
import com.ultimate.ui.Intro.IntroScreen;
import com.ultimate.ui.Login.Login;

public class Splash extends AppCompatActivity {

    private static int SPLASH_SCREEN_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


//        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
//        String checkSkipPressed = sharedPreferences.getString("intro","no");
        new Handler().postDelayed(() -> {
//            if(checkSkipPressed.equalsIgnoreCase("yes")){
//                startActivity(new Intent(Splash.this, Login.class));
//            }else {
//                startActivity(new Intent(Splash.this, IntroScreen.class));
//
//            }
            startActivity(new Intent(Splash.this, IntroScreen.class));
            finish();
        }, SPLASH_SCREEN_TIME_OUT);
    }
}