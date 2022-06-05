package com.example.tubesprogmob;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubesprogmob.R;

import java.util.ArrayList;

public class list_aves extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter recylclerViewAdapter;
    RecyclerView.LayoutManager recyleViewLayaoutManager;
    ArrayList<avesmodel> models;
    listavesadapter AdapterecyleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_aves);
        recyclerView = findViewById(R.id.data_kelompok);
        recyclerView.setHasFixedSize(true);
        recyleViewLayaoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyleViewLayaoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


        models = new ArrayList<>();
        for (int i = 0; i < dataaves.nama.length; i++) {
            models.add(
                    new avesmodel(
                            dataaves.nama[i],
                            dataaves.Keterangan[i],
                            dataaves.gambar[i]));
        }

        recylclerViewAdapter = new listavesadapter(models, this);
        recyclerView.setAdapter(recylclerViewAdapter);

    }
}