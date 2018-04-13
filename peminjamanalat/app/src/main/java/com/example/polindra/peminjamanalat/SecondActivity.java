package com.example.polindra.peminjamanalat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tanggal,waktu, alatt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String alat = getIntent().getStringExtra("alat");
        String tgl = getIntent().getStringExtra("tanggal");
        String wkt = getIntent().getStringExtra("waktu");

        alatt = (TextView) findViewById(R.id.tvAlat);
        tanggal = (TextView) findViewById(R.id.tvTanggal);
        waktu = (TextView) findViewById(R.id.tvWaktu);

        alatt.setText("alat : "+alat);
        tanggal.setText("Tanggal : "+tgl);
        waktu.setText("Waktu : "+wkt);

    }

}
