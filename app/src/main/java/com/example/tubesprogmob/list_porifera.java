package com.example.tubesprogmob;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubesprogmob.R;

import java.util.ArrayList;

public class list_porifera extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter recylclerViewAdapter;
    RecyclerView.LayoutManager recyleViewLayaoutManager;
    ArrayList<poriferamodel> models;
    listporiferaadapter AdapterecyleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_porifera);
        recyclerView = findViewById(R.id.data_kelompok);
        recyclerView.setHasFixedSize(true);
        recyleViewLayaoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyleViewLayaoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


        models = new ArrayList<>();
        for (int i = 0; i < dataporifera.nama.length; i++) {
            models.add(
                    new poriferamodel(
                            dataporifera.nama[i],
                            dataporifera.Keterangan[i],
                            dataporifera.gambar[i]));
        }

        recylclerViewAdapter = new listporiferaadapter(models, this);
        recyclerView.setAdapter(recylclerViewAdapter);

    }
}