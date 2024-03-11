package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.upscale) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new UpscaleFragment()).commit();
                } else if (item.getItemId() == R.id.colourise) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new ColouriseFragment()).commit();
                }
                return false;
            }
        });



        }
}