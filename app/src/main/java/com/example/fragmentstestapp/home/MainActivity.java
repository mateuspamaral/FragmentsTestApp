package com.example.fragmentstestapp.home;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fragmentstestapp.R;
import com.example.fragmentstestapp.fragments.ButtonsFragment;
import com.example.fragmentstestapp.interfaces.Comunicator;

public class MainActivity extends AppCompatActivity implements Comunicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButtonsFragment();
    }

    private void initButtonsFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.linearLayoutButtons, new ButtonsFragment())
                .commit();
    }

    public void replaceFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.linearLayoutColors, fragment)
                .addToBackStack("FRAGMENTS")
                .commit();
    }
}
