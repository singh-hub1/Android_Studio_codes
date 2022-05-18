package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper
{

    private static final String DB_NAME = "Company.db";

    public DBHandler(Context context)
    {
        super(context, DB_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db)
    {
      db.execSQL("create table Company(id int primary key,name text,address text,phno int)");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS Company");
    }


    public Boolean addNewCourse(String i, String j, String k,String l)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put("id", i);
        values.put("name", j);
        values.put("address", k);
        values.put("phno", l);

        long result=db.insert("Company",null,values);

        if(result ==-1)
            return false;
        else
            return true;
    }

    public Cursor getAllData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from Company",null);
        return res;
    }

}



