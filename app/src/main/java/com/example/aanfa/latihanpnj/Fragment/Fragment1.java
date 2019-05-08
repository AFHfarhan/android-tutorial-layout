package com.example.aanfa.latihanpnj.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.aanfa.latihanpnj.ActivityFragment;
import com.example.aanfa.latihanpnj.R;

public class Fragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_layout1, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final TextView tv = view.findViewById(R.id.textLayout1);
        Button btnf2 = view.findViewById(R.id.pindahdata);

        btnf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityFragment master = (ActivityFragment) getActivity();
                master.pindahhalaman(2,tv.getText().toString());
            }
        });
    }
}
