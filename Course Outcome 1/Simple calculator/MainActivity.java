package com.ajil.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    private Button add,sub,mul,div,mod;
    private EditText num1,num2;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText) findViewById(R.id.num1);
        num2=(EditText) findViewById(R.id.num2);
        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.sub);
        mul=(Button) findViewById(R.id.mul);
        div=(Button) findViewById(R.id.div);
        mod=(Button) findViewById(R.id.mod);
        result=(TextView) findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,n3;
                n1=Integer.parseInt(num1.getText().toString());
                n2=Integer.parseInt(num2.getText().toString());
                n3=n1+n2;
                result.setText(String.valueOf(n3));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,n3;
                n1=Integer.parseInt(num1.getText().toString());
                n2=Integer.parseInt(num2.getText().toString());
                n3=n1-n2;
                result.setText(String.valueOf(n3));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,n3;
                n1=Integer.parseInt(num1.getText().toString());
                n2=Integer.parseInt(num2.getText().toString());
                n3=n1*n2;
                result.setText(String.valueOf(n3));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,n3;
                n1=Integer.parseInt(num1.getText().toString());
                n2=Integer.parseInt(num2.getText().toString());
                n3=n1/n2;
                result.setText(String.valueOf(n3));
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,n3;
                n1=Integer.parseInt(num1.getText().toString());
                n2=Integer.parseInt(num2.getText().toString());
                n3=n1%n2;
                result.setText(String.valueOf(n3));
            }
        });
    }
}
