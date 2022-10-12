package com.ajil.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
            EditText s1,s2;
    public static final String DEFAULT="No Value Entered";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        s1=findViewById(R.id.user);
        s2=findViewById(R.id.pass);

    }
    public void Load(View view){
        SharedPreferences sp=getSharedPreferences("data", Context.MODE_PRIVATE);
        String user=sp.getString("username",DEFAULT);
        String pass=sp.getString("password",DEFAULT);
        if (user.equals(DEFAULT) || pass.equals(DEFAULT)) {
            Toast.makeText(this, "Data Not Found", Toast.LENGTH_SHORT).show();
        }
        else {
            s1.setText(user);
            s2.setText(pass);
            Toast.makeText(this, "Data Retrieved", Toast.LENGTH_SHORT).show();
        }
    }

    public void Prev(View view) {
        Toast.makeText(this, "First Page", Toast.LENGTH_SHORT).show();
        Intent in=new Intent(this,MainActivity.class);
        startActivity(in);
    }
}
