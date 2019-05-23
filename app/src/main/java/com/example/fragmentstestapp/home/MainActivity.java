package com.example.fragmentstestapp.home;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentstestapp.R;
import com.example.fragmentstestapp.fragments.GreenFragment;
import com.example.fragmentstestapp.fragments.RedFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonVerde;
    private Button buttonVermelho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        buttonVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new GreenFragment());
            }
        });

        buttonVermelho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new RedFragment());
            }
        });
    }

    private void initViews() {
        buttonVerde = findViewById(R.id.buttonVerde);
        buttonVermelho = findViewById(R.id.buttonVermelho);
    }

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.linearLayoutColors, fragment)
                .addToBackStack("FRAGMENTS")
                .commit();
    }
}
