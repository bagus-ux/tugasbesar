package com.example.tubesprogmob;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class quis extends Fragment implements View.OnClickListener {
    TextView pertanyaan;
    Button jwb1, jwb2, jwb3, submitJwb;
    int nilai;
    int jumlahPertanyaan =  SoalKuis.kuis.length;
    int pertanyaanIndex = 0;
    String pilihan = "";

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quis, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        pertanyaan = view.findViewById(R.id.pertanyaan);
        submitJwb = view.findViewById(R.id.submitJwb);
        jwb1 = view.findViewById(R.id.jwb1);
        jwb2 = view.findViewById(R.id.jwb2);
        jwb3 = view.findViewById(R.id.jwb3);

        pertanyaan.setOnClickListener(this);
        jwb1.setOnClickListener(this);
        jwb2.setOnClickListener(this);
        jwb3.setOnClickListener(this);
        submitJwb.setOnClickListener(this);

        loadPertanyaan();
    }
    @Override
    public void onClick(View view) {

        jwb1.setBackgroundColor(Color.WHITE);
        jwb2.setBackgroundColor(Color.WHITE);
        jwb3.setBackgroundColor(Color.WHITE);

        Button pilihanSubmit = (Button) view;
        if(pilihanSubmit.getId() == R.id.submitJwb){
            if (pilihan.equals(SoalKuis.jawaban[pertanyaanIndex])){
                nilai++;
            }
            pertanyaanIndex++;
            loadPertanyaan();
            loadPertanyaan();

        }else{
            pilihan = pilihanSubmit.getText().toString();
            pilihanSubmit.setBackgroundColor(Color.BLUE);
        }
    }
    void loadPertanyaan(){
        if(pertanyaanIndex == 5){
            selesai();
            return;
        }
        pertanyaan.setText(SoalKuis.kuis[pertanyaanIndex]);
        jwb1.setText(SoalKuis.pilihan[pertanyaanIndex][0]);
        jwb2.setText(SoalKuis.pilihan[pertanyaanIndex][1]);
        jwb3.setText(SoalKuis.pilihan[pertanyaanIndex][2]);

    }

    void selesai(){
        String status = "";
        if (nilai >=2 ){
            status = "Lulus";
        }else{
            status = "Gagal";
        }

        new AlertDialog.Builder(getContext())
                .setTitle(status)
                .setMessage("Jumlah Nilai "+ nilai)
                .setPositiveButton("Menu Utama", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent i = new Intent(getActivity(), MainActivity.class );
                        startActivity(i);

                    }
                })
                .setCancelable(false)
                .show();
    }
}