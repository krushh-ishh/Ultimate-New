package com.ultimate.ui.Intro;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.ultimate.R;
import com.ultimate.ui.Dashboard.Dashboard;
import com.ultimate.ui.Login.Login;

public class FirstScreen extends Fragment {

    ViewPager viewPager;
    TextView next_first;
    Button skip_btn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first_screen, container, false);


        next_first = view.findViewById(R.id.next_first);
        skip_btn = view.findViewById(R.id.skip_btn);




        viewPager = getActivity().findViewById(R.id.viewPager);

        next_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });

        skip_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("intro","yes");
                editor.apply();

                startActivity(new Intent(getContext(), Login.class));
                getActivity().finish();
            }
        });

        return view;
    }
}