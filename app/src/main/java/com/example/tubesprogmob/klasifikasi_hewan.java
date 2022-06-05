package com.example.tubesprogmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class klasifikasi_hewan extends AppCompatActivity {
    CardView cvInvertebrata;
    CardView cvVertebrata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.klasifikasihewan1);
        cvInvertebrata = findViewById(R.id.invertebrata);
        cvInvertebrata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(klasifikasi_hewan.this, hewan_invertebrata.class);
                startActivity(i);
            }
        });
        cvVertebrata = findViewById(R.id.vertebrata);
        cvVertebrata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(klasifikasi_hewan.this, hewan_vertebrata.class);
                startActivity(i);
            }
        });
    }
}