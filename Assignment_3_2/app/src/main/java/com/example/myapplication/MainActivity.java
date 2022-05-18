package com.example.myapplication;

import static android.view.View.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        b2=(Button) findViewById(R.id.btn_2);
        b3=(Button) findViewById(R.id.btn_3);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        b2.setOnClickListener(new OnClickListener()
//        {
//            @Override
//            public void onClick(View view)
//            {
//                Toast.makeText(MainActivity.this, "button 2", Toast.LENGTH_SHORT).show();
//            }
//        });
    }


    public void submit(View v)
    {
        Toast.makeText(this, "button 1", Toast.LENGTH_SHORT).show();
    }
}