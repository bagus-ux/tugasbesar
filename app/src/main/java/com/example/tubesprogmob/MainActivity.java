package com.example.tubesprogmob;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bNav;
    BottomNavigationView bKuis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        creature fragmentCreature = new creature();
        replaceFragment(fragmentCreature);

        bNav = findViewById(R.id.btn_bawah);
        bNav.setSelectedItemId(R.id.creature);

        bKuis = findViewById(R.id.btn_bawah);
        bKuis.setSelectedItemId(R.id.quis);


        bNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.creature){
                    replaceFragment(new creature());
                }else if(item.getItemId()==R.id.quis){
                    replaceFragment(new quis());
                }
                return true;
            }
        });

    }
    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.layout_frame, fragment);
        fragmentTransaction.commit();
    }

}