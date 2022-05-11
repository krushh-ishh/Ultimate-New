package com.ultimate.ui.Home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ultimate.R;

import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {
    List<HomeModel> list = new ArrayList<>();
    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
//        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();


        recyclerView = view.findViewById(R.id.home_recyclerView);

        list.add(new HomeModel(R.drawable.ellipse9, R.drawable.introscreen1, "Aman Shakya", "this is the text example", "1"));
        list.add(new HomeModel(R.drawable.ellipse9, R.drawable.introscreen3, "Abhishek Sharma", "this is the text example", "1"));


        HomeAdapter homeAdapter = new HomeAdapter(getContext(), list);
        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(homeAdapter);


        return view;
    }
}



