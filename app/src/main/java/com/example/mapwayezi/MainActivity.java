package com.example.mapwayezi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentMap mFragment =  new FragmentMap();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, mFragment).commit();
    }
}