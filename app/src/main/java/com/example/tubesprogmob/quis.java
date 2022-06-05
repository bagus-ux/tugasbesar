package com.example.tubesprogmob;

<<<<<<< HEAD
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
=======
import android.os.Bundle;

>>>>>>> 0f9c01957da7db5fdc5dc56013c8f87bf64f7d3f
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
<<<<<<< HEAD
import android.widget.Button;
import android.widget.TextView;

public class quis extends Fragment implements View.OnClickListener {
    TextView pertanyaan;
    Button jwb1, jwb2, jwb3, submitJwb;
    int nilai;
    int jumlahPertanyaan =  SoalKuis.kuis.length;
    int pertanyaanIndex = 0;
    String pilihan = "";
=======

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link quis#newInstance} factory method to
 * create an instance of this fragment.
 */
public class quis extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public quis() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment quis.
     */
    // TODO: Rename and change types and number of parameters
    public static quis newInstance(String param1, String param2) {
        quis fragment = new quis();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
>>>>>>> 0f9c01957da7db5fdc5dc56013c8f87bf64f7d3f

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quis, container, false);
    }
<<<<<<< HEAD
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
=======
>>>>>>> 0f9c01957da7db5fdc5dc56013c8f87bf64f7d3f
}