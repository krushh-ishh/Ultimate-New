package com.ultimate.ui.Dashboard.XYZ;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.ultimate.R;

public class XYZ extends Fragment {

    private CardView xyz_notes, xyz_samplePaper, xyz_MyNotes;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_x_y_z, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("XYZ");

        xyz_notes = view.findViewById(R.id.xyz_notes);
        xyz_samplePaper = view.findViewById(R.id.xyz_samplePaper);
        xyz_MyNotes = view.findViewById(R.id.xyz_Mynotes);

        xyz_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_notes = new Intent(getContext(), Notes.class);
                startActivity(intent_notes);
                Toast.makeText(getContext(), "Notes", Toast.LENGTH_SHORT).show();
            }
        });

        xyz_samplePaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_samplePaper = new Intent(getContext(), SamplePaper.class);
                startActivity(intent_samplePaper);
                Toast.makeText(getContext(), "Sample Paper", Toast.LENGTH_SHORT).show();
            }
        });

        xyz_MyNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_myNotes = new Intent(getContext(), MyNotes.class);
                startActivity(intent_myNotes);
            }
        });


        return view;
    }
}