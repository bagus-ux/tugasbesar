package com.example.tubesprogmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hewan_vertebrata extends AppCompatActivity {
    CardView cvMamalia;
    CardView cvReptile;
    CardView cvPisces;
    CardView cvAves;
    CardView cvAmphibi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.klasifikasi_hewan);
        cvMamalia = findViewById(R.id.mamalia);
        cvMamalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hewan_vertebrata.this, list_mamalia.class);
                startActivity(i);
            }
        });
        cvReptile = findViewById(R.id.reptile);
        cvReptile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hewan_vertebrata.this, list_reptile.class);
                startActivity(i);
            }
        });
        cvPisces = findViewById(R.id.pisces);
        cvPisces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hewan_vertebrata.this, list_pisces.class);
                startActivity(i);
            }
        });
        cvAves = findViewById(R.id.aves);
        cvAves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hewan_vertebrata.this, list_aves.class);
                startActivity(i);
            }
        });
        cvAmphibi = findViewById(R.id.amphibi);
        cvAmphibi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hewan_vertebrata.this, list_amphibi.class);
                startActivity(i);
            }
        });
    }
}