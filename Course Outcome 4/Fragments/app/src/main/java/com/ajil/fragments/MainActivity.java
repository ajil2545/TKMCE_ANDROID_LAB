package com.ajil.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 =findViewById(R.id.button);
        Button b2 =findViewById(R.id.button2);
        Button b3 =findViewById(R.id.button3);
        FragmentManager f = getSupportFragmentManager();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f.beginTransaction().replace(R.id.fragmentContainerView,fragment1.class,null).setReorderingAllowed(true).addToBackStack("anyName").commit();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f.beginTransaction().replace(R.id.fragmentContainerView,fragment2.class,null).setReorderingAllowed(true).addToBackStack("anyName").commit();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f.beginTransaction().replace(R.id.fragmentContainerView,fragment3.class,null).setReorderingAllowed(true).addToBackStack("anyName").commit();
            }
        });
    }
}