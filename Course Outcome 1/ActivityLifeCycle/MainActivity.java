package com.ajil.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle","Activity was Created");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this, "Activity was Resumed", Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle","Activity was Resumed");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this, "Activity was Paused", Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle","Activity was Paused");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this, "Activity was Stopped", Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle","Activity was Stopped");
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this, "Activity was Restarted", Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle","Activity was Restarted");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this, "Activity was Destroyed", Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle","Activity was Destroyed");
    }
}
