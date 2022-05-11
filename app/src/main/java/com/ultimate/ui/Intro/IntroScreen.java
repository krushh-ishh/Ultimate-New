package com.ultimate.ui.Intro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.google.android.material.tabs.TabLayout;
import com.ultimate.R;

public class IntroScreen extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_screen);
        getSupportActionBar().hide();


        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
//        ActionBar actionBar = getActionBar();
//        actionBar.hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        viewPager = findViewById(R.id.viewPager);

        IntroAdapter introScreens = new IntroAdapter(getSupportFragmentManager());
        viewPager.setAdapter(introScreens);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager, true);
//        dotsIndicator = (DotsIndicator) findViewById(R.id.dots_indicator);
//        dotsIndicator.setViewPager(viewPager);
    }
}