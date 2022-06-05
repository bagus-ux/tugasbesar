package com.example.tubesprogmob;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubesprogmob.R;

import java.util.ArrayList;

public class list_arthropoda extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter recylclerViewAdapter;
    RecyclerView.LayoutManager recyleViewLayaoutManager;
    ArrayList<arthropodamodel> models;
    listarthropodaadapter AdapterecyleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_arthropoda);
        recyclerView = findViewById(R.id.data_kelompok);
        recyclerView.setHasFixedSize(true);
        recyleViewLayaoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyleViewLayaoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


        models = new ArrayList<>();
        for (int i = 0; i < dataarthropoda.nama.length; i++) {
            models.add(
                    new arthropodamodel(
                            dataarthropoda.nama[i],
                            dataarthropoda.Keterangan[i],
                            dataarthropoda.gambar[i]));
        }

        recylclerViewAdapter = new listarthropodaadapter(models, this);
        recyclerView.setAdapter(recylclerViewAdapter);

    }
}