package com.example.fragmentstestapp.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fragmentstestapp.R;
import com.example.fragmentstestapp.interfaces.Comunicator;

public class ButtonsFragment extends Fragment {

    private Comunicator comunicator;

    public ButtonsFragment() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            comunicator = (Comunicator) context;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buttons, container, false);

        Button buttonVerde = view.findViewById(R.id.buttonVerde);
        Button buttonVermelho = view.findViewById(R.id.buttonVermelho);

        buttonVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               comunicator.replaceFragment(new GreenFragment());
            }
        });

        buttonVermelho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               comunicator.replaceFragment(new RedFragment());
            }
        });

        return view;
    }
}
