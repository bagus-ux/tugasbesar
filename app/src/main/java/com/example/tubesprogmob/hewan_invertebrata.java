package com.example.tubesprogmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hewan_invertebrata extends AppCompatActivity {
    CardView cvPorifera;
    CardView cvCoelenterata;
    CardView cvVermes;
    CardView cvArthropoda;
    CardView cvMollusca;
    CardView cvEchinodermata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.klasifikasi_hewan_invertebrata);
        cvPorifera = findViewById(R.id.porifera);
        cvPorifera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hewan_invertebrata.this, list_porifera.class);
                startActivity(i);
            }
        });
        cvCoelenterata = findViewById(R.id.coelenterata);
        cvCoelenterata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hewan_invertebrata.this, list_coelenterata.class);
                startActivity(i);
            }
        });
        cvVermes = findViewById(R.id.vermes);
        cvVermes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hewan_invertebrata.this, list_vermes.class);
                startActivity(i);
            }
        });
        cvArthropoda = findViewById(R.id.arthropoda);
        cvArthropoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hewan_invertebrata.this, list_arthropoda.class);
                startActivity(i);
            }
        });
        cvMollusca = findViewById(R.id.mollusca);
        cvMollusca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hewan_invertebrata.this, list_mollusca.class);
                startActivity(i);
            }
        });
        cvEchinodermata = findViewById(R.id.echinodermata);
        cvEchinodermata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hewan_invertebrata.this, list_echinodermata.class);
                startActivity(i);
            }
        });
    }
}