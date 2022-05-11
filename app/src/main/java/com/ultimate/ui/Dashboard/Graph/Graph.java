package com.ultimate.ui.Dashboard.Graph;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ultimate.R;

import java.util.ArrayList;
import java.util.List;

public class Graph extends Fragment {
    private List<GraphModel> list = new ArrayList<>();

    private RecyclerView recyclerViewGraph;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_graph, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Graph");

        recyclerViewGraph = view.findViewById(R.id.graph_recycleView);// Graph RecycleView

        // Graph RecycleView
        list.add(new GraphModel("Graph1", "Graph2", "Graph3", "Graph4", "G1" ));
        list.add(new GraphModel("Graph5", "Graph5", "Graph6", "Graph7", "G2" ));

        GraphAdapter graphAdapter = new GraphAdapter(getContext(),list);
        recyclerViewGraph.setHasFixedSize(true);
        recyclerViewGraph.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, true));
        recyclerViewGraph.setAdapter(graphAdapter);



        return view;
    }
}