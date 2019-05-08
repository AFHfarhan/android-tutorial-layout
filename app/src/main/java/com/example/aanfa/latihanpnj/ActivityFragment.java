package com.example.aanfa.latihanpnj;

import android.app.Fragment;
import android.app.FragmentContainer;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aanfa.latihanpnj.Fragment.Fragment1;
import com.example.aanfa.latihanpnj.Fragment.Fragment2;

public class ActivityFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FrameLayoutUtama,new Fragment1());
        ft.commit();

        Button btn = findViewById(R.id.btnPindah);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment2 frage = new Fragment2();

                Bundle args = new Bundle();

                args.putString("data", "Contoh data loh ini");

                frage.setArguments(args);


                FragmentTransaction fts = getSupportFragmentManager().beginTransaction();
                fts.replace(R.id.FrameLayoutUtama,frage);
                fts.addToBackStack(null);
                fts.commit();
            }
        });
    }

    public void pindahhalaman(int typehalaman,String data)
    {
        FragmentTransaction fts = getSupportFragmentManager().beginTransaction();
        if(typehalaman == 2)
        {
            Fragment2 frage = new Fragment2();
            Bundle args = new Bundle();
            args.putString("data", data);
            frage.setArguments(args);

            fts.replace(R.id.FrameLayoutUtama,frage);
            fts.addToBackStack(null);
            fts.commit();
        }
    }
}
