package com.example.tubesprogmob;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
public class MainActivity2 extends AppCompatActivity {
    ImageView gambar1;
    TextView text1 , text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan);


        getdata();
    }
    //membuat method
    private void getdata(){
        if(getIntent().hasExtra("gambar") && getIntent().hasExtra("keterangan") && getIntent().hasExtra("nama")){
            int gambar = getIntent().getIntExtra("gambar",0);
            String nama = getIntent().getStringExtra("nama");
            String keterangan = getIntent().getStringExtra("keterangan");

            TextView text1 = findViewById(R.id.text1);
            TextView text2 = findViewById(R.id.text2);
            ImageView gambar1 = findViewById(R.id.gambars);

            text1.setText(nama);
            text2.setText(keterangan);
            gambar1.setImageResource(gambar);
        }
    }
}
