package com.ajil.amplitude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().hide();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Button createAccount = findViewById(R.id.createAccount);
        EditText fname = findViewById(R.id.fname);
        EditText lname = findViewById(R.id.lname);
        EditText email = findViewById(R.id.email);
        EditText mobile = findViewById(R.id.mobile);
        EditText pass = findViewById(R.id.pass);
        EditText cpass = findViewById(R.id.cpass);
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fname.getText().toString().isEmpty())
                {
                    Toast.makeText(SignUp.this, "First Name Required", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(lname.getText().toString().isEmpty())
                    {
                        Toast.makeText(SignUp.this, "Last Name Required", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        if(email.getText().toString().isEmpty())
                        {
                            Toast.makeText(SignUp.this, "Email Id Required", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            if(mobile.getText().toString().isEmpty())
                            {
                                Toast.makeText(SignUp.this, "Mobile No. Required", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                if(pass.getText().toString().isEmpty())
                                {
                                    Toast.makeText(SignUp.this, "Password Required", Toast.LENGTH_SHORT).show();
                                }
                                else
                                {
                                    if(cpass.getText().toString().isEmpty())
                                    {
                                        Toast.makeText(SignUp.this, "Re enter password Required", Toast.LENGTH_SHORT).show();
                                    }
                                    else
                                    {
                                        String fnametxt= fname.getText().toString();
                                        String lnametxt= lname.getText().toString();
                                        String emailtxt= email.getText().toString();
                                        String mobiletxt= mobile.getText().toString();
                                        String passtxt= pass.getText().toString();
                                        boolean check=DB.insertuserdate(emailtxt,fnametxt,lnametxt,mobiletxt,passtxt);
                                        Toast.makeText(SignUp.this, "othilla", Toast.LENGTH_SHORT).show();
                                        if(check==true)
                                        {
                                            Toast.makeText(SignUp.this,"New Entry Inserted",Toast.LENGTH_SHORT).show();
                                            Intent signin = new Intent(SignUp.this,SignIn.class);
                                            startActivity(signin);
                                        }
                                        else
                                        {
                                            Toast.makeText(SignUp.this,"New Entry Not Inserted",Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });
    }
}