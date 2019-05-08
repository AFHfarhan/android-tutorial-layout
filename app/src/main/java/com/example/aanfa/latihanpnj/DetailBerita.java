package com.example.aanfa.latihanpnj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailBerita extends AppCompatActivity {

    TextView Kategori,Tgl,Title,Deskripsi;
    ImageView imv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_berita);

        Bundle extras = getIntent().getExtras();
        Kategori = findViewById(R.id.textKategori);
        Tgl = findViewById(R.id.textDate);
        Title = findViewById(R.id.txtTitle);
        Deskripsi = findViewById(R.id.DescBerita);
        imv = findViewById(R.id.imvDetail);

        if(extras != null)
        {
            Kategori.setText(extras.getString("kategori",""));
            Tgl.setText(extras.getString("tanggal",""));
            Title.setText(extras.getString("title",""));
            Deskripsi.setText(extras.getString("desc",""));
            new GetImageUrl(imv).execute(extras.getString("image",""));
        }

    }
}
