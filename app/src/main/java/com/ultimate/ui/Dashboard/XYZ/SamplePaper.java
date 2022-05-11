package com.ultimate.ui.Dashboard.XYZ;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.ultimate.R;

public class SamplePaper extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner samplePaper_spinner_course;
    private Spinner samplePaper_spinner_field;
    private Spinner samplePaper_spinner_subject;
    private Button samplePaper_button_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_paper);
        getSupportActionBar().hide();

        samplePaper_spinner_course = findViewById(R.id.samplePaper_spinner_course);
        samplePaper_spinner_subject = findViewById(R.id.samplePaper_spinner_subject);
        samplePaper_spinner_field = findViewById(R.id.samplePaper_spinner_field);
        samplePaper_button_next = findViewById(R.id.samplePaper_button_next);

        ArrayAdapter<CharSequence> adapter_field = ArrayAdapter.createFromResource(this, R.array.Field, android.R.layout.simple_spinner_item);
        adapter_field.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        samplePaper_spinner_field.setAdapter(adapter_field);

        ArrayAdapter<CharSequence> adapter_course = ArrayAdapter.createFromResource(this, R.array.Course, android.R.layout.simple_spinner_item);
        adapter_field.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        samplePaper_spinner_course.setAdapter(adapter_course);

        ArrayAdapter<CharSequence> adapter_subject = ArrayAdapter.createFromResource(this, R.array.Subject, android.R.layout.simple_spinner_item);
        adapter_field.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        samplePaper_spinner_subject.setAdapter(adapter_subject);


        samplePaper_spinner_field.setOnItemSelectedListener(this);
        samplePaper_spinner_course.setOnItemSelectedListener(this);
        samplePaper_spinner_subject.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        String choice = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(getApplicationContext(), choice, Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}