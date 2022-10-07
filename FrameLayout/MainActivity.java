package com.ajil.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView img1,img2,img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=(ImageView)findViewById(R.id.imageView1);
        img2=(ImageView)findViewById(R.id.imageView2);
        img3=(ImageView)findViewById(R.id.imageView3);
        img2.setVisibility(View.INVISIBLE);
        img3.setVisibility(View.INVISIBLE);
        Toast.makeText(this, "Diluc", Toast.LENGTH_SHORT).show();
        img1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                img1.setVisibility(View.INVISIBLE);
                img2.setVisibility(View.VISIBLE);
                img3.setVisibility(View.INVISIBLE);
                Toast.makeText(MainActivity.this, "Zhongli", Toast.LENGTH_SHORT).show();
            }
        });
        img2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                img1.setVisibility(View.INVISIBLE);
                img3.setVisibility(View.VISIBLE);
                img2.setVisibility(View.INVISIBLE);
                Toast.makeText(MainActivity.this, "Raidon Shogun", Toast.LENGTH_SHORT).show();
            }
        });
        img3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                img2.setVisibility(View.INVISIBLE);
                img1.setVisibility(View.VISIBLE);
                img3.setVisibility(View.INVISIBLE);
                Toast.makeText(MainActivity.this, "Diluc", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
