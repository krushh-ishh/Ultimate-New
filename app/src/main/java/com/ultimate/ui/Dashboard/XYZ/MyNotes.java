package com.ultimate.ui.Dashboard.XYZ;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ultimate.R;
import com.ultimate.ui.Home.HomeAdapter;
import com.ultimate.ui.Home.HomeModel;

import java.util.ArrayList;
import java.util.List;

public class MyNotes extends AppCompatActivity {


    RecyclerView myNotes_recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_notes);

        myNotes_recyclerView = findViewById(R.id.mynotes_recyclerView);






    }
}