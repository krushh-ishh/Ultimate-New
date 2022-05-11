package com.ultimate.ui.Dashboard;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ultimate.R;

public class more extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_more, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("More");


        return view;
    }
}