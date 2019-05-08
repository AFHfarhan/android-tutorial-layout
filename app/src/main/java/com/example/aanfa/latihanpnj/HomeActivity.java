package com.example.aanfa.latihanpnj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    GridView gridView;
    AdapterList adapterList,adapter;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        gridView = findViewById(R.id.gridView);

        adapterList = new AdapterList(this, R.layout.item_list_view);
        gridView.setAdapter(adapterList);

        initData();

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                DataBerita data = (DataBerita) parent.getAdapter().getItem(position);
                Intent intent = new Intent(HomeActivity.this,DetailBerita.class);
                intent.putExtra("kategori",data.getKategori());
                intent.putExtra("tanggal",data.getTanggal());
                intent.putExtra("title",data.getTitle());
                intent.putExtra("desc",data.getDeskripsi());
                intent.putExtra("image",data.getImageUrl());
                startActivity(intent);
            }
        });
    }

    private void initData() {
        ArrayList<DataBerita> datas = new ArrayList<>();


        DataBerita dataBerita1 = new DataBerita();
        dataBerita1.setKategori("detikFinance");
        dataBerita1.setTanggal("Kamis 11 Apr 2019 10:00 WIB");
        dataBerita1.setTitle("Ekonomi RI dan Inflasi Rendah Jadi Senjata Jokowi di Debat Terakhir");
        dataBerita1.setDeskripsi("Jakarta - Debat capres-cawapres terakhir akan digelar pada 13 April. Kedua pasangan akan bertarung strategi mengenai ekonomi, kesejahteraan sosial, investasi dan keuangan, serta perdagangan dan industri.");
        dataBerita1.setImageUrl("https://akcdn.detik.net.id/community/media/visual/2019/04/08/e4ae1a9c-7bd3-4aff-bedf-35ecff8935b7_169.jpeg?w=700&q=80");


        DataBerita dataBerita2 = new DataBerita();
        dataBerita2.setKategori("detikOto");
        dataBerita2.setTanggal("Kamis 11 Apr 2019 10:00 WIB");
        dataBerita2.setTitle("Modifikasi Motor Roda 3 untuk Difabel Cuma Rp 5 Juta");
        dataBerita2.setDeskripsi("Jakarta - Beberapa orang yang menyandang disabilitas akan dimudahkan untuk mengendarai sepeda motor beroda tiga. Alasannya sudah jelas akan mempermudah mereka mengoperasikan dan menyeimbangkan motor demi meminimalisir kecelakaan.");
        dataBerita2.setImageUrl("https://akcdn.detik.net.id/community/media/visual/2019/04/10/da351f2b-fd54-451b-9ef2-d0cf4027f69c.jpeg?w=780&q=90");


        DataBerita dataBerita3 = new DataBerita();
        dataBerita3.setKategori("detikSport");
        dataBerita3.setTanggal("Kamis 11 Apr 2019 10:00 WIB");
        dataBerita3.setTitle("Dunia Maya Menyambut Hantaman Smalling ke Messi");
        dataBerita3.setDeskripsi("Manchester - Chris Smalling jadi sorotan pada laga Manchester United kontra Barcelona usai meng-KO Lionel Messi. Dunia maya pun bereaksi. Seperti apa?");
        dataBerita3.setImageUrl("https://akcdn.detik.net.id/community/media/visual/2019/04/11/7954f0cb-7067-4148-b523-97759edaa505_169.jpeg?w=700&q=80");

        DataBerita dataBerita4 = new DataBerita();
        dataBerita4.setKategori("detikSport");
        dataBerita4.setTanggal("Kamis 11 Apr 2019 10:00 WIB");
        dataBerita4.setTitle("Maestro Keroncong Indonesia, Mus Mulyadi Tutup Usia");
        dataBerita4.setDeskripsi("Jakarta - Kabar duka kembali datang dari dunia musik Tanah Air. Mus Mulyadi dikabarkan meninggal dunia.");
        dataBerita4.setImageUrl("https://akcdn.detik.net.id/community/media/visual/2019/04/11/52bb4cce-1f93-4f30-a449-36ac388ab0cb_169.jpeg?w=780&q=90");


        datas.add(dataBerita1);
        datas.add(dataBerita2);
        datas.add(dataBerita3);
        datas.add(dataBerita4);

        adapterList.addAll(datas);
        adapterList.notifyDataSetChanged();



    }
}
