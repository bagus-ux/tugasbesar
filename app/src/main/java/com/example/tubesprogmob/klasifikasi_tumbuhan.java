package com.example.tubesprogmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class klasifikasi_tumbuhan extends AppCompatActivity {
    CardView cvLumut;
    CardView cvPaku;
    CardView cvBerbiji;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.klasifikasi_tumbuhan);
        cvLumut = findViewById(R.id.lumut);
        cvLumut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(klasifikasi_tumbuhan.this, list_tumbuhan_lumut.class);
                startActivity(i);
            }
            });
        cvPaku = findViewById(R.id.paku);
        cvPaku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(klasifikasi_tumbuhan.this, list_tumbuhan_paku.class);
                startActivity(i);
            }
        });
        cvBerbiji = findViewById(R.id.berbiji);
        cvBerbiji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(klasifikasi_tumbuhan.this, list_tumbuhan_berbiji.class);
                startActivity(i);
            }
        });
    }
}