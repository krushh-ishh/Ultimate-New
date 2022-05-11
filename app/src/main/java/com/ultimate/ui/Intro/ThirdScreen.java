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
import android.widget.TextView;

import com.ultimate.R;
import com.ultimate.ui.Login.Login;

public class ThirdScreen extends Fragment {

    TextView msg_third,next_third,back_third;
    ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third_screen, container, false);

        next_third = view.findViewById(R.id.next_third);
        back_third = view.findViewById(R.id.back_third);

        viewPager = getActivity().findViewById(R.id.viewPager);

        next_third.setOnClickListener(new View.OnClickListener() {
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

        back_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });



        return view;
    }
}