package com.ultimate.ui.Dashboard.Graph;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ultimate.R;

import java.util.List;

public class GraphAdapter extends RecyclerView.Adapter<GraphAdapter.Myholder>{

    Context context;
    List<GraphModel> list;

    public GraphAdapter(Context context, List<GraphModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GraphAdapter.Myholder(LayoutInflater.from(context).inflate(R.layout.graph_recycler,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {

        holder.Graph_text1.setText(list.get(position).getText1());
        holder.Graph_text2.setText(list.get(position).getText2());
        holder.Graph_text3.setText(list.get(position).getText3());
        holder.Graph_text4.setText(list.get(position).getText4());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Myholder extends RecyclerView.ViewHolder {

        TextView Graph_text1, Graph_text2, Graph_text3, Graph_text4;

        public Myholder(@NonNull View itemView) {
            super(itemView);

            Graph_text1 = itemView.findViewById(R.id.graph_text1);
            Graph_text2 = itemView.findViewById(R.id.graph_text2);
            Graph_text3 = itemView.findViewById(R.id.graph_text3);
            Graph_text4 = itemView.findViewById(R.id.graph_text4);
        }
    }
}
