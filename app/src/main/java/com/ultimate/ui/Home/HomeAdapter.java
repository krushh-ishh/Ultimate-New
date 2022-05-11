package com.ultimate.ui.Home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.ultimate.R;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.Myholder> {
    Context context;
    List<HomeModel> list;

    public HomeAdapter(Context context, List<HomeModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeAdapter.Myholder(LayoutInflater.from(context).inflate(R.layout.home_recycle,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {
        holder.home_text1.setText(list.get(position).getText1());
        holder.home_image1.setImageResource(list.get(position).getPic1());
        holder.home_text2.setText(list.get(position).getText2());
        holder.home_image2.setImageResource(list.get(position).getPic2());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Myholder extends RecyclerView.ViewHolder {

        TextView home_text1;
        TextView home_text2;
        ImageView home_image1;
        ImageView home_image2;


        public Myholder(@NonNull View itemView) {
            super(itemView);
            home_text1 = itemView.findViewById(R.id.home_text1);
            home_text2 = itemView.findViewById(R.id.home_text2);
            home_image1 = itemView.findViewById(R.id.home_image1);
            home_image2 = itemView.findViewById(R.id.home_image2);

        }
    }
}
