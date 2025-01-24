package com.ajil.amplitude;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context){
        super(context,"userdata.db",null,1);
    }
    public void onCreate(SQLiteDatabase DB){
        DB.execSQL("create Table Userdetails(email TEXT primary key,fname Text, lname Text,mobile Text,pass Text)");
    }

    public void onUpgrade(SQLiteDatabase DB,int i, int i1){
        DB.execSQL("drop Table if exists Userdetails");
    }

    public boolean insertuserdate(String email,String fname,String lname,String mobile,String pass){
        SQLiteDatabase DB=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("email",email);
        cv.put("fname",fname);
        cv.put("lname",lname);
        cv.put("mobile",mobile);
        cv.put("pass",pass);
        long result=DB.insert("Userdetails",null,cv);
        if(result==-1){
            return false;
        }
        else{
            return true;
        }
    }



    public Cursor getdata(){
        SQLiteDatabase DB=this.getWritableDatabase();
        Cursor cursor=DB.rawQuery("Select * from Userdetails",null);
        return cursor;
    }
}