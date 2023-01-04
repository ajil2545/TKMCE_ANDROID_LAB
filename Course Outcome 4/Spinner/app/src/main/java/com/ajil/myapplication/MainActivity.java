package com.ajil.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spr;
    String[] country={"India","Singapore","USA","UK","Canada"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spr=findViewById(R.id.sp);
        ArrayAdapter ad=new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        spr.setAdapter(ad);
        spr.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView mytext=(TextView) view;
        String r=mytext.getText().toString();
        Toast.makeText(this, "You have selected "+r, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}