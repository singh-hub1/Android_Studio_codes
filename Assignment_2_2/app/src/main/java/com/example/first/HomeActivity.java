package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        e1=(EditText) findViewById(R.id.etext);
        String n1=getIntent().getStringExtra("msgs");
        e1.setText(n1);
    }
}